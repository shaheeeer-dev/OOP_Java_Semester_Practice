package Problem07;

public class Truck extends DeliveryVehicle{
    public Truck(int vehicleId, String driverName) {
        super(vehicleId, driverName);
    }
    @Override
    public double calculateDeliveryCost(double distance, double weight) {
        return distance * 5 + weight * 2;
    }
}
