package secondpart;

public class Contest {
    private Animal animal1;
    private Animal animal2;
    private int round;

    public Contest(Animal animal1, Animal animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.round = 0;
    }

    public void playRound() {
        if (!animal1.isActive() || !animal2.isActive()) {
            return;
        }

        round++;

        System.out.println("--- Runde " + round + " ---");

        int damage1 = animal1.attack();
        animal2.setEnergy(animal2.getEnergy() - damage1);

        System.out.println(animal1.getName() + " angriber "
                + animal2.getName() + " for " + damage1
                + "! (" + animal2.getName() + " har "
                + animal2.getEnergy() + " energi tilbage)");

        if (animal2.isActive()) {
            int damage2 = animal2.attack();
            animal1.setEnergy(animal1.getEnergy() - damage2);

            System.out.println(animal2.getName() + " angriber "
                    + animal1.getName() + " for " + damage2
                    + "! (" + animal1.getName() + " har "
                    + animal1.getEnergy() + " energi tilbage)");
        }

        System.out.println();
    }

    public Animal getWinner() {
        if (animal1.isActive() && !animal2.isActive()) {
            return animal1;
        }

        if (animal2.isActive() && !animal1.isActive()) {
            return animal2;
        }

        return null;
    }
}
