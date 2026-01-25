//Problem 5: Smartphone & Battery

package Object_Relationships.Composition;

class Battery {
    int capacity;
    String type;

    Battery(int c, String t) {
        capacity = c;
        type = t;
    }
}

class Smartphone {
    String brand;
    Battery battery;

    Smartphone(String brand) {
        this.brand = brand;
        battery = new Battery(5000, "Li-ion");
    }
}

public class SmartphoneTest {
    public static void main(String[] args) {
        Smartphone s = new Smartphone("Samsung");
        System.out.println("Smartphone created with battery.");
    }
}