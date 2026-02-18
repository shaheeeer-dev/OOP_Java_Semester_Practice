package Problem03;

public class Student extends Person {
    private StudentRecord<Double> record;

    public Student(String name, String id) {
        super(name, id);
        this.record = new StudentRecord<>();
    }

    public void addGrade(Double grade) {
        record.addGrade(grade);
    }

    public double calculateGPA() {
        return record.calculateAverage();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("GPA: " + calculateGPA());
    }
}
