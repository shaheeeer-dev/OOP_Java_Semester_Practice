//Problem 2: Constructor Inheritance

package Core_OOP.Inheritance;

public class Employee {
    private int id;
	private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Manager extends Employee{
    private String department;

    //constructor chaining
    public Manager(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }
}
