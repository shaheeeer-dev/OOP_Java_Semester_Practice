package Mini_Projects.ATM_Simulator;

public class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 500;

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if(balance - amount < MIN_BALANCE) {
            throw new Exception("Minimum balance rule violated");
        }
        balance -= amount;
        addTransaction("Withdraw", amount);
    }
}