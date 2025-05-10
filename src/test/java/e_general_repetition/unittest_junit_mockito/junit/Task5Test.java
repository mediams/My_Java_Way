package e_general_repetition.unittest_junit_mockito.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task5Test {

    @Test
    void verify() {
        boolean result = Task5.verify("12345678Aa-");
        assertTrue(result);
        assertFalse(Task5.verify("Aa1-"));
        assertFalse(Task5.verify("Aa1-123456789012345"));
        assertFalse(Task5.verify("Aa-aaaaa"));
        assertFalse(Task5.verify("1234567A-"));
        assertFalse(Task5.verify("1234567a-"));
        assertFalse(Task5.verify("1234567Aa"));
        assertTrue(Task5.verify("1234Aa-8"));
        assertFalse(Task5.verify(""));
        assertFalse(Task5.verify(null));
    }
}