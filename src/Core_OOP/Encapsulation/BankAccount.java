//Problem 1: Bank Account Security

package Core_OOP.Encapsulation;

public class BankAccount {
    private String accountNumber;
    private  String accountHolderName;
    private int balance;

    public BankAccount(String accountNumber, String accountHolderName, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(int amount){
        if (amount<balance && amount>0){
            balance += amount;
        }
    }

    public void withdraw(int amount){
        if (amount<balance && amount>0){
            balance -= amount;
        }
        else{
            System.out.println("Not enough money");
        }
    }

    public int getBalance() {
        return balance;
    }
}
class Main{
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("GHJG456456VHJ", "Shaheer", 5000);

        bankAccount.withdraw(500);
        bankAccount.deposit(100);
        System.out.println(bankAccount.getBalance());
    }
}
