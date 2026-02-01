//Problem 3: Generic Method

package Generics;

class Printer {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class PrinterTest {
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4};
        String[] strArr = {"Java", "Generics", "Test"};
        Double[] dblArr = {1.1, 2.2, 3.3};

        Printer.printArray(intArr);
        Printer.printArray(strArr);
        Printer.printArray(dblArr);
    }
}