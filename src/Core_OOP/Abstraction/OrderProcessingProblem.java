//Problem 6: Online Order Processing System

package Core_OOP.Abstraction;

abstract class Order {
    int orderId;
    double amount;

    Order(int orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    abstract void processOrder();
}

class DigitalOrder extends Order {
    DigitalOrder(int orderId, double amount) {
        super(orderId, amount);
    }

    @Override
    void processOrder() {
        System.out.println("Processing digital order: Download link sent");
    }
}

class PhysicalOrder extends Order {
    PhysicalOrder(int orderId, double amount) {
        super(orderId, amount);
    }

    @Override
    void processOrder() {
        System.out.println("Processing physical order: Shipping initiated");
    }
}

public class OrderProcessingProblem {
    public static void main(String[] args) {
        Order o1 = new DigitalOrder(101, 500);
        Order o2 = new PhysicalOrder(102, 1500);

        o1.processOrder();
        o2.processOrder();
    }
}
