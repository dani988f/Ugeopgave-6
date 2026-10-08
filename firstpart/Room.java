package firstpart;

import java.util.ArrayList;

public class Room {
    private String name;
    private ArrayList<Lamp> lamps;
    private ArrayList<Window> windows;

    public Room(String name) {
        this.name = name;
        lamps = new ArrayList<>();
        windows = new ArrayList<>();
    }

    public void addLamp(Lamp lamp) {
        lamps.add(lamp);
    }

    public void addWindow(Window window) {
        windows.add(window);
    }

    public int getLampCount() {
        return lamps.size();
    }

    public int getTotalWatt() {
        int total = 0;

        for (Lamp lamp : lamps) {
            total += lamp.getWatt();
        }

        return total;
    }

    public int getTotalWindowArea() {
        int total = 0;

        for (Window window : windows) {
            total += window.getAreaCm2();
        }

        return total;
    }

    public void printRoom() {
        System.out.println(name + " (" + lamps.size()
                + " lamper, " + windows.size() + " vinduer)");

        System.out.print("  Lamper: ");
        for (int i = 0; i < lamps.size(); i++) {
            System.out.print(lamps.get(i));

            if (i < lamps.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println(" (total: " + getTotalWatt() + "W)");

        System.out.print("  Vinduer: ");
        for (int i = 0; i < windows.size(); i++) {
            System.out.print(windows.get(i));

            if (i < windows.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }
}

