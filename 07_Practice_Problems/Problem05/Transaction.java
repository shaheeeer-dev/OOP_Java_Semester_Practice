package Problem05;

public class Transaction<T> {
    private T type;
    private double amount;

    public Transaction(T type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public T getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction Type: " + type + ", Amount: " + amount;
    }
}