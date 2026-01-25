//Problem 1: Car & Engine

package Object_Relationships.Composition;

class Engine {
    String type;
    int hp;

    Engine(String type, int hp) {
        this.type = type;
        this.hp = hp;
    }
}

class Car {
    String brand;
    Engine engine; // Strong relationship

    Car(String brand) {
        this.brand = brand;
        engine = new Engine("V8", 500); // Created inside Car
    }

    void showCar() {
        System.out.println(brand + " Engine: " + engine.type + " " + engine.hp + "HP");
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car c = new Car("BMW");
        c.showCar();
    }
}