package secondpart;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Lion("Simba", 80));
        animals.add(new Wolf("Wolfie", 60));
        animals.add(new Rabbit("Bunny", 100));
        animals.add(new Lion("Leo", 70));

        Contest contest1 = new Contest(animals.get(0), animals.get(1));
        while (animals.get(0).isActive() && animals.get(1).isActive()) {
            contest1.playRound();
        }
        System.out.println("Vinderen er: " + contest1.getWinner());

        System.out.println();

        Contest contest2 = new Contest(animals.get(2), animals.get(3));
        while (animals.get(2).isActive() && animals.get(3).isActive()) {
            contest2.playRound();
        }
        System.out.println("Vinderen er: " + contest2.getWinner());
    }
}
