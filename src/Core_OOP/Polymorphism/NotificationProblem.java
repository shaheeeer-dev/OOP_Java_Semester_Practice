//Problem 2: Notification System

package Core_OOP.Polymorphism;

class Notification {
    public void send() {
        System.out.println("Sending notification");
    }
}

class EmailNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Sending Email notification");
    }
}

class SMSNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Sending SMS notification");
    }
}

class PushNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Sending Push notification");
    }
}

public class NotificationProblem {
    public static void main(String[] args) {
        Notification[] notifications = {
                new EmailNotification(),
                new SMSNotification(),
                new PushNotification()
        };

        for (Notification n : notifications) {
            n.send();
        }
    }
}
