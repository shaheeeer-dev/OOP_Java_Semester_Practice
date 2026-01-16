````
Encapsulation Practice Questions

Problem 1: Bank Account Security

Scenario:
A bank wants to protect customer account details.

Requirements:
•	Create a BankAccount class
•	Make data members accountNumber, accountHolderName, and balance private
•	Provide public:
•	deposit(amount)
•	withdraw(amount)
•	getBalance()
•	Prevent direct access to balance

Focus:
•	Data hiding
•	Controlled access using methods

⸻

Problem 2: Student Result System

Scenario:
A school wants to manage student marks safely.

Requirements:
•	Create a Student class
•	Private data members:
•	rollNumber
•	name
•	marks
•	Use getters and setters
•	In setter for marks, ensure marks are between 0–100

Focus:
•	Validation inside setters
•	Protecting object state

⸻

Problem 3: Employee Salary Management

Scenario:
A company wants to control employee salary updates.

Requirements:
•	Create an Employee class
•	Private fields:
•	id
•	name
•	salary
•	Provide:
•	getSalary()
•	updateSalary(percentIncrease)
•	Prevent setting salary directly

Focus:
•	Encapsulation for business rules
•	No public variables

