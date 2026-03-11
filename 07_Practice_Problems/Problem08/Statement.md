## OOP Practice Problem 8: Factory Machine Monitoring

**Scenario:**
A factory monitors different machines and records their working hours and maintenance status.

**Requirements:**
- Create a **base class** `Machine` with fields: `machineId`, `machineName`, `hoursWorked`.
-	Implement **encapsulation** for all fields.
-	Create subclasses:
-	`AssemblyMachine`
-	`PackagingMachine`
-	Each machine has a method `calculateMaintenanceCost()` implemented differently.
-	Store machines in an ArrayList.
-	Save maintenance reports to `maintenance.txt`

**Focus:**
- Inheritance
- Encapsulation
- Polymorphism
- File Handling
