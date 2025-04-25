package e_general_repetition.unittest_junit_mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(("John"), "Smith", new BigDecimal("1000"), BankAccount.CHECKING);

    }

    @Test
    void deposit() {
        BigDecimal balance = account.deposit(new BigDecimal("200"), true);
        assertEquals(new BigDecimal("1200"), balance);
    }

    @Test
    @Disabled("Not implemented yet")
    void withdraw() {
        // TODO: implement test
    }

    @Test
    void dummyTest() {
        assertEquals(20, 24);
    }

    @Test
    void getBalance_deposit() {
        account.deposit(new BigDecimal("200"), true);
        assertEquals(new BigDecimal("1200"), account.getBalance());
    }

    @Test
    void getBalance_withdraw() {
        account.withdraw(new BigDecimal("200"), true);
        assertEquals(new BigDecimal("800"), account.getBalance());
    }

    @Test
    public void isCheking() {
        assertTrue(account.isChecking(), "The account is NOT a checking account");
    }
}