package Bank;

import java.util.UUID;

class Account {
    private final String ACCOUNT_ID;
    private double balance;

    Account(double balance) {
        this.balance = balance;
        this.ACCOUNT_ID = UUID.randomUUID().toString().replace("-", "").substring(0, 23);
    }

    public String getAccountNumber() {
        return this.ACCOUNT_ID;
    }

    public double getBalance() {
        return this.balance;
    }

    protected void setBalance(double amount) {
        this.balance = amount;
    }

    void deposit(double amount) {
        if (balance <= 0.0) {
            System.out.println("You cannot deposit a balance that is negative or empty.");
            return;
        }

        balance += amount;
    }

    void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("You cannot withdraw an amount that is greater than your balance.");
            return;
        } else if (amount <= 0.0) {
            System.out.println("You cannot withdraw an amount that is negative or empty");
            return;
        }

        balance -= amount;
    }
}
