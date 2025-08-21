package b_collections_framework.LinkedList_Implementation.banksystem;

import java.util.ArrayList;
import java.util.List;

public record Customer(String name, ArrayList<Double> transactions) {
    public Customer(String name, double transactions) {
        this.name = name;
        this.transactions = new ArrayList<>(List.of(transactions));
    }

    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }

}
