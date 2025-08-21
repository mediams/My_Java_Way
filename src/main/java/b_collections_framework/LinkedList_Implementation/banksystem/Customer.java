package b_collections_framework.LinkedList_Implementation.banksystem;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private final ArrayList<Double> transactions;

    public Customer(String name, double transaction) {
        this.name = name;
        this.transactions = new ArrayList<>(List.of(transaction));
    }

    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

}

