package firstpart;

public class Main {
    public static void main(String[] args) {
        Building building = new Building("Kontorbygningen");

        Room meetingRoom = new Room("Mødelokale");
        meetingRoom.addLamp(new Lamp(60));
        meetingRoom.addLamp(new Lamp(60));
        meetingRoom.addWindow(new Window(120, 90));

        Room kitchen = new Room("Køkken");
        kitchen.addLamp(new Lamp(40));
        kitchen.addLamp(new Lamp(40));
        kitchen.addWindow(new Window(60, 60));

        Room office = new Room("Kontor");
        office.addLamp(new Lamp(100));
        office.addLamp(new Lamp(80));
        office.addWindow(new Window(100, 100));

        building.addRoom(meetingRoom);
        building.addRoom(kitchen);
        building.addRoom(office);

        building.printBuilding();
    }
}
