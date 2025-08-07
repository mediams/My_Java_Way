package b_collections_framework.LinkedList_Implementation.autoboxing.bankaccountautoboxing;


import java.util.ArrayList;

public class Bank {
    String name;
    ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>(5000);
    }

    public boolean addCustomer(Customer customer) {
        if (findCustomer(customer.getName()) < 0) {
            customers.add(customer);
            return true;
        }
        return false;
    }

    private int findCustomer(String name) {
        int i = 0;
        for (Customer c : customers) {
            if (c.getName().equals(name)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public boolean addTransaction(Customer customer, double transaction) {
        var result = findCustomer(customer.getName());
        if (result >= 0) {
            customers.get(result).addTransaction(transaction);
            return true;
        }
        return false;
    }
}
