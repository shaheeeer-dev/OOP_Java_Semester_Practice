//Problem 1: Student Data Writer

package File_Handling;

import java.io.FileWriter;
import java.io.IOException;

class StudentFileWriter {

    public void writeStudents() throws IOException {
        FileWriter fw = new FileWriter("data/students.csv");
        fw.write("Ali\n");
        fw.write("Shaheer\n");
        fw.write("Ahmed\n");
        fw.close();
    }
}

public class StudentFileWriterTest {
    public static void main(String[] args) {
        StudentFileWriter s = new StudentFileWriter();

        try {
            s.writeStudents();
            System.out.println("Students written to file.");
        }
        catch (Exception e) {
            System.out.println("Error writing file");
        }
    }
}