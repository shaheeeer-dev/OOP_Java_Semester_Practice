package Problem07;

public class Drone extends DeliveryVehicle {

    public Drone(int id, String driver) {
        super(id, driver);
    }

    @Override
    public double calculateDeliveryCost(double distance, double weight) {
        return distance * 8 + weight * 3;
    }
}