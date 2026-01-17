//Problem 1: Single Inheritance

package Core_OOP.Inheritance;

public class Person {
    private String name;
	private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Shaheer", 20, "FA24-BSE-104");
        Person student2 = new Student("Ali", 19, "FA24-BSE-087");

        student1.display();
        // student2.display();
        // Not allowed because the reference type is Person, and Person does not have display() method
    }
}

class Student extends Person{
    private String rollNumber;

    public Student(String name, int age, String rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void display(){
        System.out.println("Student Name: "+getName()+"\nage: "+getAge()+"\nRoll Number: "+getRollNumber());
    }
}