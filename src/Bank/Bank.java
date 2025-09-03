package Bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private String location;
    private List<Customer> customers;

    public Bank(String name, String location) {
        this.name = name;
        this.location = location;
        customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void createCustomer(String name, String emailAddress, String phoneNumber, String pin) {
        customers.add(new Customer(name, emailAddress, phoneNumber, pin));
    }
}
