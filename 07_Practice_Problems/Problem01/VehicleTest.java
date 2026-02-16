package Problem01;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car("C001", "Toyota", 0.08);
        Vehicle bike = new Bike("B001", "Yamaha", 0.03);
        Vehicle truck = new Truck("T001", "Ford", 0.2);

        Vehicle[] vehicles = {car, bike, truck};

        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println("Fuel cost for 100 km: $" + v.calculateFuelCost(100));
            System.out.println("----------------------------");
        }
    }
}
