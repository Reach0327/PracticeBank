import Bank.Bank;
import Bank.Customer;

public class Main {
    public static void main(String[] args) {
        Bank bank1 = new Bank("Test Bank", "123 Any St");
        bank1.createCustomer("Test Testy", "test@mail.com", "111-222-3333", "1111");

        Customer customer1 = bank1.getCustomers().get(0);
        customer1.createCheckingAccount(1000);
        customer1.createSavingsAccount(1000);
        System.out.println(customer1.getName() + "'s checking account balance is $" + customer1.getCheckingAccount().getBalance());
        System.out.println(customer1.getName() + "'s checking account id is: " + customer1.getCheckingAccount().getAccountNumber());

        System.out.println(customer1.getName() + "'s savings account balance is $" + customer1.getSavingsAccount().getBalance());

        customer1.getSavingsAccount().accrueInterest();
        System.out.println(customer1.getName() + "'s savings account balance is $" + customer1.getSavingsAccount().getBalance());

        customer1.getSavingsAccount().accrueInterest();
        System.out.println(customer1.getName() + "'s savings account balance is $" + customer1.getSavingsAccount().getBalance());
    }
}
