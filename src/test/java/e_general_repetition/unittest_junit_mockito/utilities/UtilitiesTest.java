package e_general_repetition.unittest_junit_mockito.utilities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {

    Utilities utilities = new Utilities();

    @Test
    void everyNthChar() {
        char[] sourceArray = {'h', 'e', 'l', 'l', 'o'};
        char[] expectedArray = {'e', 'l'};
        assertArrayEquals(expectedArray, utilities.everyNthChar(sourceArray, 2));
        assertArrayEquals(sourceArray, utilities.everyNthChar(sourceArray, 6));
        assertNull(utilities.everyNthChar(null, 6));
    }

    @Test
    void removePairs() {
        assertEquals("ABCEF", utilities.removePairs("AABCEEF"));
        assertEquals("ABCEAF", utilities.removePairs("AABCEEAAF"));
        assertEquals("A", utilities.removePairs("A"));
        assertEquals("", utilities.removePairs(""));
        assertNull(utilities.removePairs(null), "argument was nuul");
    }

    @Test
    void converter() {
        assertEquals(300, utilities.converter(10, 5));
    }

    @Test
    void nullIfOddLength() {
        assertNull(utilities.nullIfOddLength("Wow"));
        assertEquals("Test", utilities.nullIfOddLength("Test"));
    }
}