package Mini_Projects.ATM_Simulator;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    protected String accountNo;
    protected String name;
    protected double balance;
    private List<Transaction> transactions = new ArrayList<>();

    public Account(String accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    protected void addTransaction(String type, double amount) {
        transactions.add(new Transaction(type, amount, balance));
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public abstract void withdraw(double amount) throws Exception;

    public void deposit(double amount) {
        balance += amount;
        addTransaction("Deposit", amount);
    }

    public double checkBalance() {
        addTransaction("Balance Check", 0);
        return balance;
    }
}