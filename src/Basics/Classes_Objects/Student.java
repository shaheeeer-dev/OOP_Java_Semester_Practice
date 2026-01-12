//Problem 1: Student Record System

package Basics.Classes_Objects;

public class Student {
    int id; //Instance variables
    String name;
    double marks;

    public void display(){ //display Method
        System.out.println("ID: "+id+" Name: "+ name + " Marks: "+marks);
    }
    public static void main(String[] args) {
        Student s1 = new Student(); //object creation
        Student s2 = new Student();
        Student s3 = new Student();

        s1.id = 101;
        s2.id = 102;
        s3.id = 103;

        s1.name = "Shaheer";
        s2.name = "Ali";
        s3.name = "Sarah";

        s1.marks = 85.7;
        s2.marks = 79.5;
        s3.marks = 85.2;

        s1.display();
        s2.display();
        s3.display();

        System.out.println(
                "Average marks: "+(s1.marks+s2.marks+ s3.marks)/3
        );
    }
}
