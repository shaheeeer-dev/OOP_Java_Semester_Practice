//Problem 3: Bank Deposit System (Custom Exception)

package Exception_Handling;

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance = 1000;

    public void deposit(double amount) throws InvalidAmountException {
        if (amount < 0) {
            throw new InvalidAmountException("Negative deposit not allowed");
        }
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        try {
            acc.deposit(-200);
        }
        catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Balance = " + acc.getBalance());
    }
}