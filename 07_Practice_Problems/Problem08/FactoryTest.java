package Problem08;

import java.util.ArrayList;

public class FactoryTest {

    public static void main(String[] args) {
        ArrayList<Machine> machines = new ArrayList<>();
        machines.add(new AssemblyMachine("A101", "AssemblyBot", 120));
        machines.add(new PackagingMachine("P201", "PackMaster", 80));
        machines.add(new AssemblyMachine("A102", "AssemblyPro", 150));

        for (Machine m : machines) {
            double cost = m.calculateMaintenanceCost();
            String report = m.getMachineName() +
                    " | Hours: " + m.getHoursWorked() +
                    " | Maintenance Cost: $" + cost;

            System.out.println(report);
            Machine.saveReport(report);
        }

        System.out.println("Maintenance report saved to maintenance.txt");
    }
}