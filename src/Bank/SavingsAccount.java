package Bank;

public class SavingsAccount extends Account {
    SavingsAccount(double startingBalance) {
        super(startingBalance);
    }

    public void accrueInterest() {
        double balance = super.getBalance();
        balance += balance * 0.03;
        super.setBalance(balance);
    }
}
