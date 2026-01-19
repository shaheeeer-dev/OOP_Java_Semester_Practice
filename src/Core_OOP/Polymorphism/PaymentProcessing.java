//Problem 1: Payment Processing

package Core_OOP.Polymorphism;

class Payment {
    public void processPayment() {
        System.out.println("Processing payment");
    }
}

class CashPayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing cash payment");
    }
}

class CardPayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing card payment");
    }
}

class OnlinePayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing online payment");
    }
}

public class PaymentProcessing {
    public static void main(String[] args) {
        Payment p1 = new CashPayment();
        Payment p2 = new CardPayment();
        Payment p3 = new OnlinePayment();

        p1.processPayment();
        p2.processPayment();
        p3.processPayment();
    }
}
