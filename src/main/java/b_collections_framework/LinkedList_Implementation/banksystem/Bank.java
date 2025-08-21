package b_collections_framework.LinkedList_Implementation.banksystem;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final String name;
    private final ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String name) {
        if (findBranch(name) != null) {
            return false;
        }
        Branch branch = new Branch(name);
        return branches.add(branch);
    }

    public boolean addCustomer(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }

        return branch.newCustomer(customerName, transaction);
    }

    private Branch findBranch(String name) {
        for (Branch branch : branches) {
            if (branch.getName().equals(name)) {
                return branch;
            }
        }
        return null;
    }

    public boolean addCustomerTransaction(String nameBranch, String nameCustomer, double transaction) {
        Branch branch = findBranch(nameBranch);
        if (branch == null) {
            return false;
        }
        return branch.addCustomerTransaction(nameCustomer, transaction);
    }

    public boolean listCustomers(String nameBranch, boolean isPrint) {
        Branch branch = findBranch(nameBranch);
        if (branch == null) {
            return false;
        }
        List<Customer> customers = branch.getCustomers();
        System.out.println("Customer details for branch " + branch.getName());
        if (isPrint) {
            int i = 1;
            for (Customer customer : customers) {
                System.out.println("Customer: " + customer.name() + "[" + i++ + "]");
                System.out.println("Transactions");
                int t = 1;
                for (double transaction : customer.transactions()) {
                    System.out.println("[" + t++ + "] Amount " + transaction);
                }
            }
        }
        if (!isPrint) {
            int i = 1;
            for (Customer customer : customers) {
                System.out.println("Customer: " + customer.name() + "[" + i++ + "]");
            }
        }
        return true;
    }
}
