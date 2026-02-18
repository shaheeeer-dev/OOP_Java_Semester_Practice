package Problem03;

public class UniversityTest {
    public static void main(String[] args) {
        Student s1 = new Student("Shaheer", "FA24-BSE-104");
        Student s2 = new Student("Ali", "FA24-BSE-087");

        s1.addGrade(3.5);
        s1.addGrade(4.0);
        s2.addGrade(2.8);
        s2.addGrade(3.2);

        Person[] students = {s1, s2};

        for (Person p : students) {
            p.displayInfo();
        }
    }
}