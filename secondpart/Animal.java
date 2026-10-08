package secondpart;

public class Animal {
    private String name;
    private int energy;

    public Animal(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;

        if (this.energy < 0) {
            this.energy = 0;
        }
    }

    public boolean isActive() {
        return energy > 0;
    }

    public int attack() {
        return 5;
    }

    public String toString() {
        return name + " (energi: " + energy + ")";
    }
}
