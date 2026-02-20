package Problem05;

public class SavingsAccount extends BankAccount {
    private int withdrawalCount = 0;

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (withdrawalCount >= 3) {
            System.out.println("Withdrawal limit reached!");
            return;
        }

        if (amount <= balance) {
            balance -= amount;
            withdrawalCount++;
            System.out.println("Withdrawn from Savings: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public void calculateInterest() {
        double interest = balance * 0.05;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
}