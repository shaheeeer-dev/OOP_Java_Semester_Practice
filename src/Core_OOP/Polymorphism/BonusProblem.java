//Problem 5: Employee Bonus System

package Core_OOP.Polymorphism;

class Employee {
    public double calculateBonus() {
        return 0;
    }
}

class Manager extends Employee {
    @Override
    public double calculateBonus() {
        return 20000;
    }
}

class Developer extends Employee {
    @Override
    public double calculateBonus() {
        return 10000;
    }
}

public class BonusProblem {
    public static void main(String[] args) {
        Employee e1 = new Manager();
        Employee e2 = new Developer();

        System.out.println(e1.calculateBonus());
        System.out.println(e2.calculateBonus());
    }
}
