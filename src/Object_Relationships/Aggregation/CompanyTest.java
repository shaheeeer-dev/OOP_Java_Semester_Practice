//Problem 4: Company & Employee

package Object_Relationships.Aggregation;

import java.util.ArrayList;

class Employee {
    private int id;
    private String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Company {
    private String name;
    ArrayList<Employee> employees;

    Company(String name, ArrayList<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }
}

public class CompanyTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Ali");
        Employee e2 = new Employee(2, "Shaheer");

        ArrayList<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);

        Company c = new Company("Google", list);
        System.out.println("Company created with employees.");
    }
}