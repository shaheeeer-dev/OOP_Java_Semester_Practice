//Problem 1: Generic Box

package Generics;

class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

public class BoxTest {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setContent(42);
        System.out.println("Integer Box contains: " + intBox.getContent());

        Box<String> strBox = new Box<>();
        strBox.setContent("Hello Generics");
        System.out.println("String Box contains: " + strBox.getContent());

        Box<Double> dblBox = new Box<>();
        dblBox.setContent(3.1415);
        System.out.println("Double Box contains: " + dblBox.getContent());
    }
}