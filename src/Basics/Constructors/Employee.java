//Problem 4: Employee Management (Constructor Chaining)

package Basics.Constructors;

public class Employee {
    int id;
	String name;
	double salary;

    //constructor with (id, name)
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //constructor with (id, name, salary)
    public Employee(int id, String name, double salary) {
        this(id, name);
        this.salary = salary;
    }

    public void display(){
        System.out.println("ID: "+ id+ " name: "+name+ " salary: "+salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Ali");
        Employee e2 = new Employee(2, "Ahmed", 75000);

        e1.display();
        e2.display();
    }
}
