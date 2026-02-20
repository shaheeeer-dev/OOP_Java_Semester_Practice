##  OOP Practice Problem 5: Smart Banking System

**Scenario:**
A bank wants to manage different types of accounts and maintain transaction history. Each account has common details like account number and holder name, but interest calculation and withdrawal rules differ. The system must also store transaction records.

**Requirements:**
- Create an abstract class `BankAccount` with private fields: `accountNumber`, `holderName`, `balance`.
- Implement encapsulation using getters and setters.
- Add abstract methods:
- `calculateInterest()`
- `withdraw(double amount)`
- Create subclasses:
- `SavingsAccount` (adds interest, limited withdrawals)
- `CurrentAccount` (no interest, overdraft allowed up to a limit)
- Create a generic class `Transaction<T>` to store transaction details (Deposit, Withdraw, etc.).
- Implement **file handling** to save transaction history into a file (`transactions.txt`).
- Write a BankTest main class to demonstrate:
- Creating different account types
- Calling methods polymorphically using BankAccount references
- Recording and saving transactions

**Focus:**
- Inheritance & Abstraction
- Encapsulation
- Polymorphism
-Generics
- File Handling
