package Problem05;

public class BankTest {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("SA101", "Shaheer", 10000);
        BankAccount acc2 = new CurrentAccount("CA202", "Ali", 2000);

        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.calculateInterest();
        acc1.displayInfo();

        Transaction<String> t1 = new Transaction<>("Deposit", 2000);
        TransactionLogger.saveTransaction(t1);
        System.out.println("--------------------------------");

        acc2.withdraw(6000);
        acc2.calculateInterest();
        acc2.displayInfo();

        Transaction<String> t2 = new Transaction<>("Withdraw", 6000);
        TransactionLogger.saveTransaction(t2);
    }
}