//Problem 4: School & Classroom

package Object_Relationships.Composition;

class Classroom {
    int roomNo;
    int capacity;

    Classroom(int no, int cap) {
        roomNo = no;
        capacity = cap;
    }
}

class School {
    Classroom c1 = new Classroom(101, 50);
    Classroom c2 = new Classroom(102, 40);
}

public class SchoolTest {
    public static void main(String[] args) {
        School s = new School();
        System.out.println("School with classrooms created.");
    }
}
