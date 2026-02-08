package Mini_Projects.ATM_Simulator;

import java.time.LocalDateTime;

public class Transaction {
    private String type;
    private double amount;
    private double balanceAfter;
    private LocalDateTime dateTime;

    public Transaction(String type, double amount, double balanceAfter) {
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
        this.dateTime = LocalDateTime.now();
    }

    public String toString() {
        return dateTime + " | " + type +
                " | Amount: " + amount +
                " | Balance: " + balanceAfter;
    }
}