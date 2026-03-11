package Problem08;

public class AssemblyMachine extends Machine {
    public AssemblyMachine(String id, String name, int hours) {
        super(id, name, hours);
    }

    @Override
    public double calculateMaintenanceCost() {
        return getHoursWorked() * 10;
    }
}