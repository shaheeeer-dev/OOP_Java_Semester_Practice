//Problem 3: Employee Salary Management

package Core_OOP.Encapsulation;

public class Employee {

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void updateSalary(double percentIncrease) {
        if (percentIncrease > 0) {
            salary = salary + (salary * percentIncrease / 100);
        }
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, "Shaheer", 50000);

        emp.display();

        emp.updateSalary(10);
        System.out.println("\nAfter Salary Update:");
        emp.display();

        // emp.salary = 100000; Not allowed (private)
    }
}