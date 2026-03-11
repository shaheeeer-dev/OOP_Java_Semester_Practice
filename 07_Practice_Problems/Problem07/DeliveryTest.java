package Problem07;

public class DeliveryTest {

    public static void main(String[] args) {
        DeliveryVehicle[] vehicles = new DeliveryVehicle[3];
        vehicles[0] = new Truck(101, "Ali");
        vehicles[1] = new Bike(201, "Ahmed");
        vehicles[2] = new Drone(301, "Sara");

        double distance = 10;
        double weight = 5;
        for (DeliveryVehicle v : vehicles) {
            double cost = v.calculateDeliveryCost(distance, weight);
            String result = v.getClass().getSimpleName() +
                    " | Driver: " + v.getDriverName() +
                    " | Cost: $" + cost;

            System.out.println(result);
            DeliveryVehicle.log(result);
        }

        System.out.println("Delivery records saved to deliveries.txt");
    }
}
