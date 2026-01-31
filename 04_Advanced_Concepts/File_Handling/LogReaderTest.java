//Problem 5: User Log Reader with Line Count

package File_Handling;

import java.io.*;

class LogReader {
    public void readLogs(String fileName) {
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                count++;
            }

            System.out.println("Total log entries: " + count);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

public class LogReaderTest {
    public static void main(String[] args) {
        LogReader reader = new LogReader();
        reader.readLogs("data/logs.txt");
    }
}