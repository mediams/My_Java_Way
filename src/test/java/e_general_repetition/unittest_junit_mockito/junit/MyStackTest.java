package e_general_repetition.unittest_junit_mockito.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyStackTest {
    private MyStack myStack;

    @BeforeEach
    void setUp() {
        myStack = new MyStack(16);
    }

    @Test
    void push() {
        assertEquals(0, myStack.size());
        myStack.push("A");
        myStack.push("B");
        myStack.push("C");
        myStack.push("D");
        assertEquals(4, myStack.size());

    }

    @Test
    @Disabled
    void pop() {
    }

    @Test
    @Disabled
    void peek() {
    }

    @Test
    @Disabled
    void size() {
    }

    @Test
    @Disabled
    void isEmpty() {
    }

}