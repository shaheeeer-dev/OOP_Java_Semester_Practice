//Problem 1: Student Admission System

package Basics.Constructors;

public class Student {
    int studentId;
	String name;
	String department;

    //parameterized constructor
    public Student(int studentId, String name, String department) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
    }

    public void display() {
        System.out.println("studentId= " + studentId +'\n'+
                "name= " + name + '\n' +
                "department= " + department);
    }

    public static void main(String[] args) {
        //Object initialization at creation time
        Student s1 = new Student(104, "Shaheer", "CS");
        Student s2 = new Student(87, "Ali", "BBA");

        s1.display();
        System.out.println(" ");
        s2.display();
    }
}
