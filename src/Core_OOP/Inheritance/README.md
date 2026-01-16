```
Inheritance Practice Questions

Problem 1: Single Inheritance (Basics)

Scenario
A school wants to store information about people.

Requirements
	•	Create a base class Person with:
	•	name
	•	age
	•	Create a subclass Student with:
	•	rollNumber
	•	Use inherited attributes to display full student details.

Covers
	•	Single inheritance
	•	Parent → child data access

⸻

Problem 2: Constructor Inheritance

Scenario
A company manages employees.

Requirements
	•	Base class Employee with:
	•	id
	•	name
	•	Constructor in Employee to initialize data
	•	Subclass Manager with:
	•	department
	•	Use super() to initialize parent attributes.

Covers
	•	Constructor chaining
	•	super() usage

⸻

Problem 3: Method Inheritance & Extension

Scenario
A bank stores account information.

Requirements
	•	Base class Account with:
	•	accountNumber
	•	displayInfo() method
	•	Subclass SavingsAccount with:
	•	interestRate
	•	Extend displayInfo() in child class to show extra data.

Covers
	•	Inherited methods
	•	Method extension (not polymorphism focus)

⸻

Problem 4: Multilevel Inheritance

Scenario
An organization defines staff hierarchy.

Requirements
	•	Base class Staff:
	•	staffId
	•	Subclass TeachingStaff:
	•	subject
	•	Subclass Professor:
	•	researchArea
	•	Create object of Professor and access all inherited members.

Covers
	•	Multilevel inheritance
	•	Transitive inheritance

⸻

Problem 5: Hierarchical Inheritance

Scenario
A transport system categorizes vehicles.

Requirements
	•	Base class Vehicle:
	•	vehicleNumber
	•	Subclasses:
	•	Car (doors)
	•	Bus (capacity)
	•	Truck (loadLimit)
	•	Show how multiple classes inherit from the same parent.

Covers
	•	Hierarchical inheritance
	•	Code reuse across siblings
