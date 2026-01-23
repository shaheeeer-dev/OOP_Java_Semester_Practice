//Problem 2: Notification System

package Core_OOP.Interfaces;

interface Notification {
    void send(String message);
}

class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}

class SMSNotification implements Notification {
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}

class PushNotification implements Notification {
    public void send(String message) {
        System.out.println("Push Notification: " + message);
    }
}

public class NotificationTest {
    public static void main(String[] args) {
        Notification[] notifications = {
                new EmailNotification(),
                new SMSNotification(),
                new PushNotification()
        };

        for (Notification n : notifications) {
            n.send("Hello User!");
        }
    }
}