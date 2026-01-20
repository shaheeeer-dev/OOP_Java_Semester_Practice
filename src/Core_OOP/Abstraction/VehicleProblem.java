//Problem 4: Vehicle Fuel System

package Core_OOP.Abstraction;

abstract class Vehicle {
    abstract double fuelConsumption();
}

class Car extends Vehicle {
    @Override
    double fuelConsumption() {
        return 8.5;
    }
}

class Bike extends Vehicle {
    @Override
    double fuelConsumption() {
        return 3.0;
    }
}

class Bus extends Vehicle {
    @Override
    double fuelConsumption() {
        return 25.0;
    }
}

public class VehicleProblem {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Bus bus = new Bus();

        Vehicle[] vehicle = {car, bike, bus};

        for (Vehicle vehicles : vehicle){
            System.out.println(vehicles.fuelConsumption());
        }
    }
}
