//Problem 3: Attendance Logger (Append Mode)

package File_Handling;

import java.io.*;

class AttendanceLogger {

    public void logAttendance(String name) throws IOException {
        FileWriter fw = new FileWriter("data/attendance.txt", true);
        fw.write(name + "\n");
        fw.close();
    }
}

public class AttendanceLoggerTest {
    public static void main(String[] args) {
        AttendanceLogger a = new AttendanceLogger();

        try {
            a.logAttendance("Shaheer");
            a.logAttendance("Ali");
            System.out.println("Attendance logged.");
        }
        catch (Exception e) {
            System.out.println("Error logging attendance");
        }
    }
}