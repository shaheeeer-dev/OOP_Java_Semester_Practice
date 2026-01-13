//Problem 2: Bank Account Simulator

package Basics.Classes_Objects;

public class BankAccount {
    String accountNumber;
    String holderName;
    double balance;

    public void deposit(int amount){
        if (amount<balance && amount>0){
            balance += amount;
        }
    }

    public void withdraw(int amount){
        if (amount<balance && amount>0){
            balance -= amount;
        }
    }

    public void displayAccount(){
        System.out.println("Account Number: "+accountNumber +
                "\nHolder Name: "+holderName+
                "\nBalance: "+balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();

        b1.accountNumber = "ABH21837HJ";
        b2.accountNumber = "KJD23478SW";

        b1.holderName = "Shaheer";
        b2.holderName = "Ali";

        b1.balance = 5000.23;
        b2.balance = 82398.09;

        System.out.println("Before Withdraw:");
        b1.displayAccount();
        b1.withdraw(2000);
        System.out.println("\nAfter Withdraw:");
        b1.displayAccount();

        System.out.println("\nBefore Deposit:");
        b2.displayAccount();
        b2.deposit(500);
        System.out.println("\nAfter Deposit:");
        b2.displayAccount();
    }
}
