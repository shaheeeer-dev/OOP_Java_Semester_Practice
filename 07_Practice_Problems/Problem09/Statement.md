## OOP Practice Problem 9: Game Inventory System

**Scenario:**
A game manages items collected by players. Items can be weapons, potions, or armor.

**Requirements:**
-	Create an **abstract class** `GameItem` with fields: `itemId`, `name`.
-	Create subclasses:
-	`Weapon`
-	`Potion`
-	`Armor`
-	Implement a **generic class** `Inventory<T>` that stores game items.
-	Add methods:
-	`addItem(T item)`
-	`showItems()`
-	Demonstrate storing different items in inventory.

**Focus:**
-	Generics
-	Abstraction
-	Inheritance