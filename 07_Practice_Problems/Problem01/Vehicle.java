package Problem01;

abstract class Vehicle {
    private String vehicleId;
    private String brand;
    private double fuelConsumptionPerKm;

    public Vehicle(String vehicleId, String brand, double fuelConsumptionPerKm) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public double getFuelConsumptionPerKm() {
        return fuelConsumptionPerKm;
    }

    abstract double calculateFuelCost(double distance);

    public void displayInfo() {
        System.out.println("vehicleId: " + getVehicleId() +
                "\nbrand: '" + getBrand() +
                "\nfuelConsumptionPerKm: " + getFuelConsumptionPerKm());
    }
}
