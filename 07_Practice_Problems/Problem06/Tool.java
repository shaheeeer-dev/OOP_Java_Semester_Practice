package Problem06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

abstract public class Tool {
    private int toolId;
    private String name;
    private double cost;

    public Tool(int toolId, String name, double cost) {
        this.toolId = toolId;
        this.name = name;
        this.cost = cost;
    }

    public int getToolId() {
        return toolId;
    }

    public void setToolId(int toolId) {
        this.toolId = toolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void logUsage(String message) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("07_Practice_Problems/Problem06/tool_usage.txt", true))) {
            bw.write(message);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to log file: " + e.getMessage());
        }
    }

    abstract public void useTool(int i);
}
