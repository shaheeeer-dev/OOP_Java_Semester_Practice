//Problem 3: Method Inheritance & Extension

package Core_OOP.Inheritance;

public class Account {
    private String accountNumber;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void displayInfo(){
        System.out.println("Account Number: "+accountNumber);
    }

    public static void main(String[] args) {
        Account account = new Account("HJGHJ3483");
        SavingsAccount savingsAccount = new SavingsAccount("LKJI38345", 10.5);

        account.displayInfo();
        savingsAccount.displayInfo();
    }
}

class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(String accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    @Override
    public void displayInfo() {
        System.out.println("\nSaving Account");
        super.displayInfo();
        System.out.println("Interest Rate: "+interestRate);
    }
}
