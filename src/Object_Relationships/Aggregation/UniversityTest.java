//Problem 1: University & Student

package Object_Relationships.Aggregation;

import java.util.ArrayList;

class Student {
    private int id;
    private String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class University {
    private String uniName;
    ArrayList<Student> students;

    University(String uniName, ArrayList<Student> students) {
        this.uniName = uniName;
        this.students = students;
    }

    void showStudents() {
        System.out.println("University: " + uniName);
        for (Student s : students)
            System.out.println(s.getId() + " - " + s.getName());
    }
}

public class UniversityTest {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Ali");
        Student s2 = new Student(2, "Shaheer");

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);

        University u = new University("COMSATS", list);
        u.showStudents();
    }
}
