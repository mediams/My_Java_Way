package e_general_repetition.unittest_junit_mockito.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {
    private MyStack myStack;

    @BeforeEach
    void setUp() {
        myStack = new MyStack(4);
    }

    @Test
    void push() {
        assertEquals(0, myStack.size());
        myStack.push("A");
        myStack.push("B");
        myStack.push("C");
        myStack.push("D");
        assertEquals(4, myStack.size());

        assertThrows(RuntimeException.class, () -> myStack.push("F"));

    }

    @Test
    void pop() {
        assertThrows(RuntimeException.class, () -> myStack.pop());
        myStack.push("A");
        myStack.push("B");
        myStack.push("C");
        myStack.push("D");

        assertEquals("D", myStack.pop());
        assertEquals("C", myStack.pop());
        assertEquals("B", myStack.pop());
        assertEquals("A", myStack.pop());
        assertThrows(RuntimeException.class, () -> myStack.pop());
    }

    @Test
    void peek() {
        assertThrows(RuntimeException.class, () -> myStack.peek());
        myStack.push("A");
        myStack.push("B");
        assertEquals("B", myStack.peek());
    }

    @Test
    void size() {
        myStack.push("A");
        myStack.push("B");
        assertEquals(2, myStack.size());
    }

    @Test
    void isEmpty() {
        assertTrue(myStack.isEmpty());
        myStack.push("B");
        assertFalse(myStack.isEmpty());
    }

}