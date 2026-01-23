//Problem 5: Vehicle Control System

package Core_OOP.Interfaces;

interface VehicleControl {
    void start();
    void stop();
}

class Bus implements VehicleControl {
    public void start() {
        System.out.println("Bus started");
    }
    public void stop() {
        System.out.println("Bus stopped");
    }
}

class Car implements VehicleControl {
    public void start() {
        System.out.println("Car started");
    }
    public void stop() {
        System.out.println("Car stopped");
    }
}

class Bike implements VehicleControl {
    public void start() {
        System.out.println("Bike started");
    }
    public void stop() {
        System.out.println("Bike stopped");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        VehicleControl[] vehicles = {
                new Bus(),
                new Car(),
                new Bike()
        };

        for (VehicleControl v : vehicles) {
            v.start();
            v.stop();
        }
    }
}