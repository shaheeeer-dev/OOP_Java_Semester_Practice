```
Problem 1: Payment Processing

Scenario
An online store supports multiple payment types.

Requirements
•	Base class Payment with method processPayment()
•	Subclasses:
•	CashPayment
•	CardPayment
•	OnlinePayment
•	Call processPayment() using a Payment reference for each type.

Focus
•	Runtime method dispatch
•	Method overriding

⸻

Problem 2: Notification System

Scenario
A system sends notifications in different ways.

Requirements
•	Base class Notification with method send()
•	Subclasses:
•	EmailNotification
•	SMSNotification
•	PushNotification
•	Store objects in a base-class array and call send().

Focus
•	Polymorphic array
•	Same method, different outputs

⸻

Problem 3: Shape Area Calculator

Scenario
A program calculates area of shapes.

Requirements
•	Base class Shape with method calculateArea()
•	Subclasses:
•	Circle
•	Rectangle
•	Triangle
•	Call calculateArea() using Shape references.

Focus
•	Dynamic binding
•	Behavior decided at runtime

⸻

Problem 4: Media Player

Scenario
A media player plays different file types.

Requirements
•	Base class MediaFile with method play()
•	Subclasses:
•	AudioFile
•	VideoFile
•	Use base-class reference to call play().

Focus
•	Method overriding
•	Late binding

⸻

Problem 5: Employee Bonus System

Scenario
A company gives bonuses differently.

Requirements
•	Base class Employee with method calculateBonus()
•	Subclasses:
•	Manager
•	Developer
•	Call method using base reference.

Focus
•	Polymorphic behavior
•	No conditionals (if/else) allowed

⸻

Problem 6: Transport Fare Calculation

Scenario
A transport system calculates fare for different transport types.

Requirements
	•	Base class Transport
	•	method: calculateFare(int distance)
	•	Subclasses:
	•	Bus
	•	Train
	•	Taxi
	•	Each subclass calculates fare differently.
	•	Store all objects using Transport references.
	•	Call calculateFare() for each object.

Focus
	•	Inheritance (Bus, Train, Taxi extend Transport)
	•	Polymorphism (runtime method selection)
	•	No if/else or instanceof
