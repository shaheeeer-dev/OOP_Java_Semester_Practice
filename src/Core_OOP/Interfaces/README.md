```
INTERFACES PRACTICE QUESTIONS

🔹 Problem 1: Payment System

Scenario:
An online store supports multiple payment methods.

Requirements:
•	Create an interface Payment
•	method: processPayment(double amount)
•	Implement classes:
•	CashPayment
•	CardPayment
•	OnlinePayment
•	Demonstrate calling processPayment() using interface reference.

Focus:
Interface implementation, runtime polymorphism.

⸻

🔹 Problem 2: Notification System

Scenario:
A system sends notifications via different channels.

Requirements:
•	Interface Notification
•	method: send(String message)
•	Classes:
•	EmailNotification
•	SMSNotification
•	PushNotification
•	Store objects in Notification[] and call send().

Focus:
Interface array and dynamic binding.

⸻

🔹 Problem 3: Printable Documents

Scenario:
A printer prints different document types.

Requirements:
•	Interface Printable
•	method: print()
•	Classes:
•	PDFDocument
•	WordDocument
•	ImageFile
•	Call print() using interface reference.

Focus:
Multiple implementations of same behavior.

⸻

🔹 Problem 4: Smart Devices

Scenario:
A smart home system controls devices.

Requirements:
•	Interface SmartDevice
•	methods:
•	turnOn()
•	turnOff()
•	Classes:
•	SmartLight
•	SmartFan
•	SmartTV
•	Control devices using interface references.

Focus:
Multiple device control via interface.

⸻

🔹 Problem 5: Vehicle Control System

Scenario:
A transport company manages different vehicles.

Requirements:
•	Interface VehicleControl
•	method: start()
•	method: stop()
•	Classes:
•	Bus
•	Car
•	Bike
•	Store objects in an interface array and control all vehicles.

Focus:
Interface as contract, no base class allowed.