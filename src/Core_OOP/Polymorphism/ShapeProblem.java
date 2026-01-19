//Problem 3: Shape Area Calculator

package Core_OOP.Polymorphism;

class Shape {
    public double calculateArea() {
        return 0;
    }
}

class Circle extends Shape {
    private double radius = 5;

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length = 4;
    private double width = 6;

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double base = 4;
    private double height = 5;

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class ShapeProblem {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        Shape shape3 = new Triangle();

        System.out.println(shape1.calculateArea());
        System.out.println(shape2.calculateArea());
        System.out.println(shape3.calculateArea());
    }
}
