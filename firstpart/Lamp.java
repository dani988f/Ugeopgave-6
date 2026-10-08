package firstpart;

public class Lamp {
    private int watt;
    private boolean isOn;

    public Lamp(int watt) {
        this.watt = watt;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public int getWatt() {
        return watt;
    }

    public String toString() {
        return watt + "W";
    }
}

