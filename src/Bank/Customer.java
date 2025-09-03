package Bank;

public class Customer {
    private String name;
    private String emailAddress;
    private String phoneNumber;
    private String pin;
    private CheckingAccount checkingAccount;
    private SavingsAccount savingsAccount;

    protected Customer(String name, String emailAddress, String phoneNumber, String pin) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.pin = pin;
    }

    public String getName() {
        return this.name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public CheckingAccount getCheckingAccount() {
        return checkingAccount;
    }

    public SavingsAccount getSavingsAccount() {
        return savingsAccount;
    }

    public void createCheckingAccount(double amount) {
        checkingAccount = new CheckingAccount(amount);
    }

    public void createSavingsAccount(double amount) {
        savingsAccount = new SavingsAccount(amount);
    }

    @Override
    public String toString() {
        return "Bank.Customer{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", pin='" + pin + '\'' +
                ", checkingAccount=" + checkingAccount +
                ", savingsAccount=" + savingsAccount +
                '}';
    }
}
