package Problem08;

public class PackagingMachine extends Machine{
    public PackagingMachine(String id, String name, int hours) {
        super(id, name, hours);
    }

    @Override
    public double calculateMaintenanceCost() {
        return getHoursWorked() * 6;
    }
}