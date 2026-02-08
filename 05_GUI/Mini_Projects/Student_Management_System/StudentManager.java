package Mini_Projects.Project_01;

import java.io.*;
import java.util.ArrayList;

class StudentManager {
    private final ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) { students.add(s); }

    public ArrayList<Student> getStudents() { return students; }

    public Student searchById(String id) {
        for (Student s : students) {
            if (s.getId().equalsIgnoreCase(id)) return s;
        }
        return null;
    }

    public ArrayList<Student> searchByName(String name) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) result.add(s);
        }
        return result;
    }

    public void deleteStudent(Student s) { students.remove(s); }
}