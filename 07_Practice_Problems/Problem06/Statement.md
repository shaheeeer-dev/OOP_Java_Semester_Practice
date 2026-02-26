## OOP Practice Problem 6: Workshop Inventory & Tool Usage Tracker

**Scenario:**
A mechanical workshop wants to manage its tools inventory and track usage. Tools have different types, costs, and usage rules. They also want to store tool usage logs in a file.

**Requirements:**
- Create a base class `Tool` with fields: `toolId`, `name`, `cost`.
- Add encapsulation for all fields.
- Create subclasses:
- `HandTool` (e.g., Hammer, Wrench)
- `PowerTool` (e.g., Drill, Grinder)
- Add a method `useTool(int hours)` in each subclass to calculate wear and usage cost differently:
- HandTool: cost increases `$1` per hour
- PowerTool: cost increases `$5` per hour
- Store multiple tools in a `Tool[]` array and demonstrate polymorphism by calling `useTool()` on each.
- Implement file handling to save usage logs in `tool_usage.txt`.

Focus Concepts:
- Inheritance
- Encapsulation
- Polymorphism
- File Handling

Main Class: `WorkshopTest`
