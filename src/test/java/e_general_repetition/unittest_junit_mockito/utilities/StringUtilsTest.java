package e_general_repetition.unittest_junit_mockito.utilities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    private StringUtils stringUtils;

    @BeforeEach
    void setUp() {
        stringUtils = new StringUtils();
    }

    @Test
    void reverse_checkNull() {
        assertNull(stringUtils.reverse(null));
    }

    @Test
    void reverse() {
        assertEquals("olleH", stringUtils.reverse("Hello"));
    }

    @Test
    void isPalindrome_isNull() {
        assertFalse(stringUtils.isPalindrome(null));
    }

    @Test
    void isPalindrome() {
        assertTrue(stringUtils.isPalindrome("Ollo"));
    }

    @Test
    void toCamelCase_checkNull() {
        assertNull(stringUtils.toCamelCase(null));
    }

    @Test
    void toCamelCase_isEmpty() {
        assertEquals("", stringUtils.toCamelCase(""));
    }

    @Test
    void toCamelCase() {
        assertEquals("camelCase", stringUtils.toCamelCase("camel_case"));
    }
}