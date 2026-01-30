````
Problem 1: Appliance Control

Scenario
Different appliances work differently.

Requirements
	•	Abstract class Appliance
	•	Abstract method turnOn()
	•	Subclasses:
	•	Fan
	•	AirConditioner
	•	Implement turnOn() in each subclass.

Focus
	•	Abstract method enforcement

⸻

Problem 2: Bank Account Types

Scenario
Bank supports multiple account types.

Requirements
	•	Abstract class Account
	•	Abstract method calculateInterest()
	•	Subclasses:
	•	SavingsAccount
	•	CurrentAccount

Focus
	•	Abstract behavior definition
	•	Concrete implementation

⸻

Problem 3: Employee Salary System

Scenario
Employees are paid differently.

Requirements
	•	Abstract class Employee
	•	Abstract method calculateSalary()
	•	Subclasses:
	•	HourlyEmployee
	•	SalariedEmployee

Focus
	•	Template definition via abstract class

⸻

Problem 4: Vehicle Fuel System

Scenario
Vehicles consume fuel differently.

Requirements
	•	Abstract class Vehicle
	•	Abstract method fuelConsumption()
	•	Subclasses:
	•	Car
	•	Bike
	•	Bus

Focus
	•	Common structure, forced implementation

⸻

Problem 5: Shape Drawing System

Scenario
A program draws shapes.

Requirements
	•	Abstract class Shape
	•	Abstract method draw()
	•	Subclasses:
	•	Circle
	•	Rectangle

Focus
	•	Abstract base reference
	•	No direct object of abstract class

⸻

Problem 6: Online Order Processing System

Scenario
An e-commerce system processes different types of orders.

Requirements
	•	Abstract class Order
	•	fields: orderId, amount
	•	abstract method processOrder()
	•	Subclasses:
	•	DigitalOrder
	•	PhysicalOrder
	•	Implement processOrder() differently in each subclass.
	•	Use an Order reference to process multiple orders.

Focus
	•	Abstract class inheritance
	•	Method overriding
	•	Polymorphism via abstract reference
	•	No concrete object of Order
