//Problem 2: Student Result System

package Core_OOP.Encapsulation;

public class Student {
    private String rollNumber;
    private String name;
    private double marks;

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100){
            this.marks = marks;
        }
    }
}