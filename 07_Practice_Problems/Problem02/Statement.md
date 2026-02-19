## 📚 OOP Practice Problem 2: Library Management System <br><hr>
**Scenario:**  
A library wants to manage its collection of books, magazines, and DVDs. Each item has common attributes like title, author, and item ID, but different rules for borrowing.

**Requirements:**
- Create an **abstract class** `LibraryItem` with fields: `title`, `author`, `itemId`.
- Add an **abstract method** `calculateLateFee(int daysLate)`.
- Create subclasses: `Book`, `Magazine`, `DVD`.
    - Each subclass calculates late fee differently:
        - Book: $1 per day late
        - Magazine: $0.5 per day late
        - DVD: $2 per day late
- Implement **encapsulation** for fields.
- Write a `LibraryTest` main class to demonstrate:
    - Creating different items
    - Calculating late fees polymorphically using base-class references

**Focus:**
- Inheritance, Abstraction, Polymorphism
- Encapsulation for item properties