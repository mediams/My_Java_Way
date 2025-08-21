package b_collections_framework.LinkedList_Implementation.banksystem;

import java.util.ArrayList;

public class Branch {
    private final String name;
    private final ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public boolean newCustomer(String name, double transaction) {
        if (findCustomer(name) != null) return false;
        return customers.add(new Customer(name, transaction));
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        Customer customer = findCustomer(name);
        if (customer == null) {
            return false;
        }
        customer.addTransaction(transaction);
        return true;
    }

    private Customer findCustomer(String name) {
        for (Customer customer : customers) {
            if (customer.name().equals(name)) {
                return customer;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

}
