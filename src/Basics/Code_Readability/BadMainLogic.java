//Problem 2: Method Refactoring

package Basics.Code_Readability;

public class BadMainLogic {
    static void badMainLogic() {
        int x = 10;
        int y = 20;
        int z = x + y;

        System.out.println("Sum: " + z);
    }

    //Refactored Version
    static void goodMethodRefactor() {
         int result = addNumbers(10, 20);
         System.out.println("Sum: " + result);
    }

    static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
}
