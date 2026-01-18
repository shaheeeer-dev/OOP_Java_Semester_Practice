//Problem 5: Hierarchical Inheritance

package Core_OOP.Inheritance;

public class Vehicle {
    private String vehicleNumber;

    public Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
}

class Car extends Vehicle{
    private int doors;

    public Car(String vehicleNumber, int doors) {
        super(vehicleNumber);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}

class Bus extends Vehicle{
    private int capacity;

    public Bus(String vehicleNumber, int capacity) {
        super(vehicleNumber);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

class Truck extends Vehicle{
    private double loadLimit;

    public Truck(String vehicleNumber, int loadLimit) {
        super(vehicleNumber);
        this.loadLimit = loadLimit;
    }

    public double getLoadLimit() {
        return loadLimit;
    }

    public void setLoadLimit(double loadLimit) {
        this.loadLimit = loadLimit;
    }
}