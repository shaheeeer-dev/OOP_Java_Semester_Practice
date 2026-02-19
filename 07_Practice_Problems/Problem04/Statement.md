## OOP Practice Problem 4: Game Character System

**Scenario:**
A game wants to manage different types of characters like Warriors, Mages, and Archers. Each character has attributes like name, level, and health, but attacks differently. Players also have inventories to store items.

**Requirements:**
- Create an abstract class `GameCharacter` with private fields: `name`, `level`, `health`.
- Implement encapsulation using getters and setters.
- Add an abstract method `attack()`.
- Create subclasses `Warrior`, `Mage`, `Archer` that override `attack()` with unique messages.
- Create a generic class `Inventory<T>` to store items.
- Write a main class `GameTest` to demonstrate:
- Creating different character objects
- Storing characters in an array and calling `attack()` polymorphically
- Creating inventories for each character and showing stored items

**Focus:**
- Inheritance, Abstraction, Polymorphism
- Encapsulation for character properties
- Generics for flexible item storage
