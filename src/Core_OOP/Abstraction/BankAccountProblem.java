//Problem 2: Bank Account Types

package Core_OOP.Abstraction;

abstract class Account {
    abstract double calculateInterest();
}

class SavingsAccount extends Account {
    @Override
    double calculateInterest() {
        return 0.04;
    }
}

class CurrentAccount extends Account {
    @Override
    double calculateInterest() {
        return 0.02;
    }
}

public class BankAccountProblem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        CurrentAccount currentAccount = new CurrentAccount();

        System.out.println(savingsAccount.calculateInterest());
        System.out.println(currentAccount.calculateInterest());
    }
}
