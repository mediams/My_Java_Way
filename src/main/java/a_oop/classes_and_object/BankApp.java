package a_oop.classes_and_object;

import java.util.Scanner;

public class BankApp {
    BankAccount bankAccount = new BankAccount(1, 0, "John", "post@mail.com", "123456-78");

    public static void main(String[] args) {
        BankApp bankApp = new BankApp();

        System.out.println(bankApp.bankAccount);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter 1 (deposit) or 2 (withdraw)");
            int choose = scanner.nextInt();
            if (choose == 1) {
                System.out.println("Enter sum: ");
                choose = scanner.nextInt();
                bankApp.deposit(choose);
            } else {
                System.out.println("Enter sum: ");
                choose = scanner.nextInt();
                bankApp.withdraw(choose);
            }
        } while (true);
    }

    public void deposit(int sum) {
        bankAccount.setAccountBalance(bankAccount.getAccountBalance() + sum);
        System.out.println(bankAccount);
    }

    public void withdraw(int sum) {
        bankAccount.setAccountBalance(bankAccount.getAccountBalance() - sum);
        System.out.println(bankAccount);
    }

}
