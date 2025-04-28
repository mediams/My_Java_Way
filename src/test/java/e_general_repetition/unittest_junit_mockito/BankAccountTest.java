package e_general_repetition.unittest_junit_mockito;

import e_general_repetition.unittest_junit_mockito.bankaccount.BankAccount;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private BankAccount account;
    public static int count = 0;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All Count = " + count++);
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After All Count = " + count++);
    }

    @BeforeEach
    void setUp() {
        account = new BankAccount(("John"), "Smith", new BigDecimal("1000"), BankAccount.CHECKING);
    }

    @Test
    void deposit() {
        BigDecimal balance = account.deposit(new BigDecimal("200"), true);
        assertEquals(new BigDecimal("1200"), balance);
        System.out.println("Count = " + count++);
    }

    @Test
//    @Disabled("Not implemented yet")
    void withdraw_branch() {
        BigDecimal balance = account.withdraw(new BigDecimal("600"), true);
        assertEquals(new BigDecimal("400"), balance);
        System.out.println("Count = " + count++);
    }

    @Test
    void withdraw_notBranche() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(new BigDecimal("501"), false);
        });
        assertEquals("You can't withdraw more than 500 outside the branch", exception.getMessage());
        System.out.println("Count = " + count++);
    }

    @Test
    void dummyTest() {
        assertEquals(20, 24);
        System.out.println("Count = " + count++);
    }

    @Test
    void getBalance_deposit() {
        account.deposit(new BigDecimal("200"), true);
        assertEquals(new BigDecimal("1200"), account.getBalance());
        System.out.println("Count = " + count++);
    }

    @Test
    void getBalance_withdraw() {
        account.withdraw(new BigDecimal("200"), true);
        assertEquals(new BigDecimal("800"), account.getBalance());
        System.out.println("Count = " + count++);
    }

    @Test
    public void isCheking() {
        assertTrue(account.isChecking(), "The account is NOT a checking account");
        System.out.println("Count = " + count++);
    }
}