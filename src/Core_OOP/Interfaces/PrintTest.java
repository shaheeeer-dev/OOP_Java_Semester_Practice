//Problem 3: Printable Documents

package Core_OOP.Interfaces;

interface Printable {
    void print();
}

class PDFDocument implements Printable {
    public void print() {
        System.out.println("Printing PDF Document...");
    }
}

class WordDocument implements Printable {
    public void print() {
        System.out.println("Printing Word Document...");
    }
}

class ImageFile implements Printable {
    public void print() {
        System.out.println("Printing Image File...");
    }
}

public class PrintTest {
    public static void main(String[] args) {
        Printable p1 = new PDFDocument();
        Printable p2 = new WordDocument();
        Printable p3 = new ImageFile();

        p1.print();
        p2.print();
        p3.print();
    }
}