## OOP Practice Problem 7: Package Delivery System

**Scenario:**
A logistics company manages different delivery vehicles to transport packages. Each vehicle calculates delivery cost differently depending on distance and package weight.

**Requirements:**
- Create an **abstract class** `DeliveryVehicle` with fields: `vehicleId`, `driverName`.
- Add an **abstract method** `calculateDeliveryCost(double distance, double weight)`
- Create subclasses:
- **Truck**
- **Bike**
- **Drone**
- Each vehicle calculates delivery cost differently.
- Store vehicles in a `DeliveryVehicle[]` array and call `calculateDeliveryCost()` polymorphically.
- Save delivery details to `deliveries.txt` using file handling.

**Focus**:
- Abstraction
- Inheritance
- Polymorphism
- File Handling
