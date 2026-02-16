## 🚗 OOP Practice Problem <br>
<hr>

### 📌 Problem Statement <br>
Design and implement a <b>Smart Vehicle Management System</b> using proper Object-Oriented Programming principles. <br><br>
A transport company manages different types of vehicles. Each vehicle calculates fuel cost differently depending on its type. <br>
Your task is to model this system using abstraction, inheritance, encapsulation, and polymorphism. <br><br>

### 🔹 Requirements <br>
1. Create an abstract class <code>Vehicle</code> with the following: <br>
    - Private fields: <code>vehicleId</code>, <code>brand</code>, <code>fuelConsumptionPerKm</code> <br>
    - Constructor to initialize all fields <br>
    - Getter methods <br>
    - An abstract method: <br>
      <code>double calculateFuelCost(double distance);</code> <br>
    - A concrete method: <br>
      <code>void displayInfo();</code> <br><br>

2. Create three subclasses: <code>Car</code>, <code>Bike</code>, <code>Truck</code> <br>
    - Each subclass must extend <code>Vehicle</code> <br>
    - Override <code>calculateFuelCost(double distance)</code> <br>
    - Apply its own fuel pricing logic <br><br>

3. Ensure: <br>
    - All fields are properly encapsulated (no public variables) <br>
    - No type checking using <code>instanceof</code> <br>
    - Polymorphism is used for method calls <br><br>

4. Create a test class <code>VehicleTest</code>: <br>
    - Create at least one object of each vehicle type <br>
    - Store them using a base class reference <br>
    - Display vehicle details <br>
    - Calculate and print fuel cost for 100 km <br><br>

### 🎯 Objective <br>
The goal of this problem is to demonstrate: <br>
- Encapsulation <br>
- Abstraction <br>
- Inheritance <br>
- Method Overriding <br>
- Runtime Polymorphism <br>