package Problem06;

public class WorkshopTest {
    public static void main(String[] args) {
        Tool[] tools = new Tool[4];

        tools[0] = new HandTool(100, "Hammer", 25);
        tools[1] = new HandTool(110, "Wrench", 15);
        tools[2] = new PowerTool(210, "Drill", 100);
        tools[3] = new PowerTool(220, "Grinder", 150);

        int[] hoursUsed = {5, 3, 4, 2};

        for (int i = 0; i < tools.length; i++) {
            tools[i].useTool(hoursUsed[i]);
        }

        System.out.println("All tool usages have been logged in tool_usage.txt");
    }
}