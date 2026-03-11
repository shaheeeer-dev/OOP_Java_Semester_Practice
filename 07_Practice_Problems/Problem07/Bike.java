package Problem07;

public class Bike extends DeliveryVehicle{
    public Bike(int vehicleId, String driverName) {
        super(vehicleId, driverName);
    }

    @Override
    public double calculateDeliveryCost(double distance, double weight) {
        return distance * 2 + weight * 1;
    }
}
