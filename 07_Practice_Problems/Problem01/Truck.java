package Problem01;

public class Truck extends Vehicle{
    private double fuelPricePerLiter = 2.5;

    public Truck(String vehicleId, String brand, double fuelConsumptionPerKm) {
        super(vehicleId, brand, fuelConsumptionPerKm);
    }

    @Override
    public double calculateFuelCost(double distance) {
        return getFuelConsumptionPerKm() * distance * fuelPricePerLiter;
    }
}
