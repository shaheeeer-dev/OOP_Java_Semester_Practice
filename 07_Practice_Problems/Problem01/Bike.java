package Problem01;

public class Bike extends Vehicle{
    private double fuelPricePerLiter = 1.5;

    public Bike(String vehicleId, String brand, double fuelConsumptionPerKm) {
        super(vehicleId, brand, fuelConsumptionPerKm);
    }

    @Override
    public double calculateFuelCost(double distance) {
        return getFuelConsumptionPerKm() * distance * fuelPricePerLiter;
    }
}
