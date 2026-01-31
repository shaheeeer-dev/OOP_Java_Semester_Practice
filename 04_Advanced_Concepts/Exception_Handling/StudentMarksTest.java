//Problem 2: Student Marks System

package Exception_Handling;

class StudentMarks {
    private int[] marks = {90, 85, 70};

    public int getMark(int index) {
        return marks[index];
    }
}

public class StudentMarksTest {
    public static void main(String[] args) {
        StudentMarks s = new StudentMarks();

        try {
            System.out.println(s.getMark(5));
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! No such student mark.");
        }
    }
}