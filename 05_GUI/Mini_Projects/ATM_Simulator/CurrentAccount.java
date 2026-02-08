package Mini_Projects.ATM_Simulator;

public class CurrentAccount extends Account{
    private double overdraftLimit = 5000;
    private double withdrawalLimit = 20000;

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if(amount <= 0) {
            throw new Exception("Invalid withdrawal amount");
        }
        if(amount > withdrawalLimit){
            throw new Exception("Withdrawal limit exceeded");
        }
        if(balance - amount < -overdraftLimit) {
            throw new Exception("Overdraft limit exceeded");
        }
        balance -= amount;
        addTransaction("Withdraw", amount);
    }
}
