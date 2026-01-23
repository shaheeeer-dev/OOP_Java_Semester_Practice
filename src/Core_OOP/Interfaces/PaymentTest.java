//Problem 1: Payment System

package Core_OOP.Interfaces;

interface Payment {
    void processPayment(double amount);
}

class CashPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Cash payment of Rs " + amount + " processed.");
    }
}

class CardPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Card payment of Rs " + amount + " processed.");
    }
}

class OnlinePayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Online payment of Rs " + amount + " processed.");
    }
}

public class PaymentTest {
    public static void main(String[] args) {
        Payment p1 = new CashPayment();
        Payment p2 = new CardPayment();
        Payment p3 = new OnlinePayment();

        p1.processPayment(1000);
        p2.processPayment(2000);
        p3.processPayment(1500);
    }
}