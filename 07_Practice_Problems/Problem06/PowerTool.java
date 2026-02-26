package Problem06;

public class PowerTool extends Tool{
    public PowerTool(int toolId, String name, double cost) {
        super(toolId, name, cost);
    }

    public void useTool(int hours) {
        double usageCost = hours * 5;
        setCost(getCost() + usageCost);
        String log = "PowerTool Used: " + getName() + ", Hours: " + hours + ", New Cost: $" + getCost();
        logUsage(log);
        System.out.println(log);
    }
}
