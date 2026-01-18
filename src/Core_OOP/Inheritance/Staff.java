//Problem 4: Multilevel Inheritance

package Core_OOP.Inheritance;

public class Staff {
    private int staffId;

    public Staff(int staffId) {
        this.staffId = staffId;
    }

    public void display(){
        System.out.println("This is Staff!");
    }

    public static void main(String[] args) {
        Staff  staff = new Staff(123);
        TeachingStaff  teachingStaff = new TeachingStaff(345);
        Professor  professor = new Professor(532);

        staff.display();
        teachingStaff.display();
        professor.display();
    }
}
class TeachingStaff extends Staff{
    public TeachingStaff(int staffId) {
        super(staffId);
    }

    public void display(){
        System.out.println("This is Teaching Staff!");
    }
}
class Professor extends TeachingStaff{
    public Professor(int staffId) {
        super(staffId);
    }

    public void display(){
        System.out.println("This is Professor!");
    }
}