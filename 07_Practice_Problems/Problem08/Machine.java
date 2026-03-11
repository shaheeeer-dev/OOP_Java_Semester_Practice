package Problem08;

import java.io.FileWriter;
import java.io.IOException;

public class Machine {
    private String machineId;
    private String machineName;
    private int hoursWorked;

    public Machine(String machineId, String machineName, int hoursWorked) {
        this.machineId = machineId;
        this.machineName = machineName;
        this.hoursWorked = hoursWorked;
    }

    public String getMachineId() {
        return machineId;
    }

    public String getMachineName() {
        return machineName;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double calculateMaintenanceCost() {
        return 0;
    }

    public static void saveReport(String text) {
        try {
            FileWriter writer = new FileWriter("maintenance.txt", true);
            writer.write(text + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("File error");
        }
    }
}