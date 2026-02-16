package Problem01;

public class Car extends Vehicle{
    private double fuelPricePerLiter = 2.0;

    public Car(String vehicleId, String brand, double fuelConsumptionPerKm) {
        super(vehicleId, brand, fuelConsumptionPerKm);
    }

    @Override
    public double calculateFuelCost(double distance) {
        return getFuelConsumptionPerKm() * distance * fuelPricePerLiter;
    }
}
