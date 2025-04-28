package e_general_repetition.unittest_junit_mockito.bankaccount;

import java.math.BigDecimal;

public class BankAccount {
    public static final int CHECKING = 1;
    public static final int SAVING = 2;
    private final String firstName;
    private final String lastName;
    private final int accountType;
    private BigDecimal balance;

    public BankAccount(String firstName, String lastName, BigDecimal balance, int accountType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public BigDecimal deposit(BigDecimal amount, boolean branch) {
        balance = balance.add(amount);
        return balance;
    }

    public BigDecimal withdraw(BigDecimal amount, boolean branch) {
        if (amount.compareTo(new BigDecimal("500")) > 0 && !branch) {
            throw new IllegalArgumentException("You can't withdraw more than 500 outside the branch");
        }
        balance = balance.subtract(amount);
        return balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public boolean isChecking() {
        return accountType == CHECKING;
    }


}
