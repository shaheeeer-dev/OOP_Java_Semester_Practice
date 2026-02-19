## 🎓 OOP Practice Problem 3: University Student Records

**Scenario:**
A university wants to manage its student records and grades. They want to store students of different programs and calculate their GPA.

**Requirements:**
- Create a generic `StudentRecord<T>` class to store grades of type T (Integer, Double, etc.)
- Create a **base class** `Person` with `name` and `id` (private fields, use encapsulation)
- `Student` class extends `Person` and uses `StudentRecord<Double>` for grades
- Add methods to **calculate GPA, display student info**, and **store multiple students** in an array
- Demonstrate inheritance, encapsulation, and generics

**Focus Concepts:**
- Generics
- Inheritance
- Encapsulation
- Polymorphism (array of Person calling displayInfo())

**Main Class:** `UniversityTest`