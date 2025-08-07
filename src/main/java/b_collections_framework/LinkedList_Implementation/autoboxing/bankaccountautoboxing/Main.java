package b_collections_framework.LinkedList_Implementation.autoboxing.bankaccountautoboxing;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Postbank");
        Customer john = new Customer("John", 17);
        System.out.println(bank.addCustomer(john));
        System.out.println(bank.addCustomer(new Customer("John", 0)));
        System.out.println(bank.addCustomer(new Customer("Ivan", 50)));

        System.out.println(bank.customers);

        System.out.println(bank.addTransaction(john, 10));
        System.out.println(bank.addTransaction(john, -3));
        System.out.println(bank.customers);
    }
}
