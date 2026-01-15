// Problem 1: Improve Variable Naming

package Basics.Code_Readability;

public class BadNaming {
    public static void main(String[] args) {
        //Unclear names
        int a = 80;
        int b = 75;
        int c = a + b;

        System.out.println("Total: " + c);

        //Good Variable Naming
        int mathMarks = 80;
        int englishMarks = 75;
        int totalMarks = mathMarks + englishMarks;

        System.out.println("Total Marks: " + totalMarks);
    }
}