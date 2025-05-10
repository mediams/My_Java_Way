package e_general_repetition.unittest_junit_mockito.junit;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTaskTest {

    @Test
    void search() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        int c = BinarySearchTask.search(list, "C");
        assertEquals(2, c);
        assertEquals(0, BinarySearchTask.search(list, "A"));
        assertEquals(5, BinarySearchTask.search(list, "F"));
        assertEquals(-1, BinarySearchTask.search(list, "Y"));
    }
}