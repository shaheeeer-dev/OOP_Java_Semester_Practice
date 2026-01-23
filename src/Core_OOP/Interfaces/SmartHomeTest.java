//Problem 4: Smart Devices

package Core_OOP.Interfaces;

interface SmartDevice {
    void turnOn();
    void turnOff();
}

class SmartLight implements SmartDevice {
    public void turnOn() {
        System.out.println("Smart Light ON");
    }
    public void turnOff() {
        System.out.println("Smart Light OFF");
    }
}

class SmartFan implements SmartDevice {
    public void turnOn() {
        System.out.println("Smart Fan ON");
    }
    public void turnOff() {
        System.out.println("Smart Fan OFF");
    }
}

class SmartTV implements SmartDevice {
    public void turnOn() {
        System.out.println("Smart TV ON");
    }
    public void turnOff() {
        System.out.println("Smart TV OFF");
    }
}

public class SmartHomeTest {
    public static void main(String[] args) {
        SmartDevice[] devices = {
                new SmartLight(),
                new SmartFan(),
                new SmartTV()
        };

        for (SmartDevice d : devices) {
            d.turnOn();
            d.turnOff();
        }
    }
}