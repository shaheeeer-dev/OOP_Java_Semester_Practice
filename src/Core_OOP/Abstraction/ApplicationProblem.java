//Problem 1: Appliance Control

package Core_OOP.Abstraction;

abstract class Appliance{
    abstract void turnOn();
}

class Fan extends Appliance{
    @Override
    void turnOn() {
        System.out.println("Fan is an Appliance");
    }
}

class AirConditioner extends Appliance{
    @Override
    void turnOn() {
        System.out.println("Air Conditioner is an Appliance");
    }
}

public class ApplicationProblem {
    public static void main(String[] args) {
        Fan fan = new Fan();
        AirConditioner airConditioner = new AirConditioner();

        fan.turnOn();
        airConditioner.turnOn();
    }
}
