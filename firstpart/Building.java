package firstpart;

import java.util.ArrayList;

public class Building {
    private String name;
    private ArrayList<Room> rooms;

    public Building(String name) {
        this.name = name;
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public int getTotalLampCount() {
        int total = 0;

        for (Room room : rooms) {
            total += room.getLampCount();
        }

        return total;
    }

    public int getTotalWatt() {
        int total = 0;

        for (Room room : rooms) {
            total += room.getTotalWatt();
        }

        return total;
    }

    public void printBuilding() {
        System.out.println("=== " + name + " ===");

        for (Room room : rooms) {
            room.printRoom();
            System.out.println();
        }

        System.out.println("Total: " + getTotalLampCount()
                + " lamper, " + getTotalWatt() + "W");
    }
}
