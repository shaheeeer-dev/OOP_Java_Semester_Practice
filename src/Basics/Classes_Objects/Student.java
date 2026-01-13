//Problem 1: Student Record System

package Basics.Classes_Objects;

public class Student {  //Student class
    //Instance variables
    int id;
    String name;
    double marks;

    //display Method
    public void display(){
        System.out.println("ID: "+id+" Name: "+ name + " Marks: "+marks);
    }
    public static void main(String[] args) {
        //object creation
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        //initializing objects
        s1.id = 101;
        s1.name = "Shaheer";
        s1.marks = 85.7;

        s2.id = 102;
        s2.name = "Ali";
        s2.marks = 79.5;

        s3.id = 103;
        s3.name = "Sarah";
        s3.marks = 85.2;

        //display function call
        s1.display();
        s2.display();
        s3.display();

        //Average marks
        System.out.println(
                "Average marks: "+(s1.marks+s2.marks+ s3.marks)/3
        );
    }
}
