//Problem 3: Employee Salary System

package Core_OOP.Abstraction;

abstract class Employee {
    abstract double calculateSalary();
}

class HourlyEmployee extends Employee {
    private int hours;
    private double rate;

    HourlyEmployee(int hours, double rate) {
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    double calculateSalary() {
        return hours * rate;
    }
}

class SalariedEmployee extends Employee {
    private double monthlySalary;

    SalariedEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

public class SalaryProblem {
    public static void main(String[] args) {
        SalariedEmployee e1 = new SalariedEmployee(30000);
        HourlyEmployee e2 = new HourlyEmployee(20,75);

        System.out.println(e1.calculateSalary());
        System.out.println(e2.calculateSalary());
    }
}
