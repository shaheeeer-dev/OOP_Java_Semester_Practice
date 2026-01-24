//Problem 3: Department & Teacher

package Object_Relationships.Aggregation;

import java.util.ArrayList;

class Teacher {
    private String name, subject;

    Teacher(String n, String s) {
        name = n;
        subject = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

class Department {
    private String deptName;
    ArrayList<Teacher> teachers;

    Department(String dptName, ArrayList<Teacher> teachers) {
        deptName = dptName;
        this.teachers = teachers;
    }
}

public class DepartmentTest {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ali", "Math");
        Teacher t2 = new Teacher("Ahmed", "Physics");

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(t1);
        teachers.add(t2);

        Department d = new Department("CS", teachers);
        System.out.println("Department created with teachers.");
    }
}
