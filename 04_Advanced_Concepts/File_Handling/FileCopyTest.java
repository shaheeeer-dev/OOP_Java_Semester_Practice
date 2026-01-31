//Problem 4: File Copy System

package File_Handling;

import java.io.*;

class FileCopy {
    public void copyFile(String source, String backup) {
        try (BufferedReader br = new BufferedReader(new FileReader(source));
             BufferedWriter bw = new BufferedWriter(new FileWriter(backup))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

public class FileCopyTest {
    public static void main(String[] args) {
        FileCopy copier = new FileCopy();
        copier.copyFile("data/source.txt", "data/backup.txt");
    }
}