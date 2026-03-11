package Problem07;

import java.io.FileWriter;
import java.io.IOException;

abstract public class DeliveryVehicle {
    private int vehicleId;
    private String driverName;

    public DeliveryVehicle(int vehicleId, String driverName) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    abstract public double calculateDeliveryCost(double distance, double weight);

    public static void log(String text) {
        try {
            FileWriter writer = new FileWriter("07_Practice_Problems/Problem07/deliveries.txt", true);
            writer.write(text + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}
