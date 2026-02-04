package Mini_Projects.Project_01;

import java.io.*;
import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void updateStudent(String id, Student updated) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                students.set(i, updated);
                return;
            }
        }
    }

    public void deleteStudent(String id) {
        students.removeIf(s -> s.getId().equals(id));
    }

    public Student searchStudentById(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) return s;
        }
        return null;
    }

    public ArrayList<Student> searchStudentByName(String name) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) result.add(s);
        }
        return result;
    }

    public ArrayList<Student> getAllStudents() {
        return students;
    }
}