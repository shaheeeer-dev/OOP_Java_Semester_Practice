package Problem06;

public class HandTool extends  Tool{
    public HandTool(int toolId, String name, double cost) {
        super(toolId, name, cost);
    }

    public void useTool(int hours) {
        double usageCost = hours * 1;
        setCost(getCost() + usageCost);
        String log = "HandTool Used: " + getName() + ", Hours: " + hours + ", New Cost: $" + getCost();
        logUsage(log);
        System.out.println(log);
    }
}
