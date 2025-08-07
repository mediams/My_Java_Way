package b_collections_framework.LinkedList_Implementation.autoboxing.bankaccountautoboxing;

import java.util.ArrayList;

public record Customer(String name, ArrayList<Double> transactions) {

    public Customer(String name, double initialDeposit) {
        this(name, new ArrayList<>(500));
        transactions.add(initialDeposit);
    }

    public boolean addTransaction(double transaction) {
        return transactions.add(transaction);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name = '" + name + '\'' +
                ", transactions = " + transactions +
                ", Sum = " + transactions.stream().mapToDouble(Double::doubleValue).sum() +
                '}';
    }
}
