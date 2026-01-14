//Problem 2: Bank Account Setup

package Basics.Constructors;

public class BankAccount {
    String accountNumber;
	String accountHolder;
	int balance;

    //default constructor (balance = 0)
    public BankAccount() {
        this.balance = 0;
    }

    //parameterized constructor (custom balance)
    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 5000;
    }

    void display(){
        System.out.println("Account Number: "+accountNumber+" Holder's Name: "+accountHolder+ " Balance: "+balance );
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount("AHD2382", "SHAHEER");

        b1.display();
        b2.display();
    }
}
