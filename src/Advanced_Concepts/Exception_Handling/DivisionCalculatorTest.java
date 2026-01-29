//Problem 1: Safe Division Calculator

package Advanced_Concepts.Exception_Handling;

class DivisionCalculator {

    public int divide(int a, int b) {
        return a / b;
    }
}

public class DivisionCalculatorTest {
    public static void main(String[] args) {
        DivisionCalculator calc = new DivisionCalculator();

        try {
            int result = calc.divide(10, 0);
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }
    }
}