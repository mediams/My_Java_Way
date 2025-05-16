package e_general_repetition.unittest_junit_mockito.junit;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TasksTest {
    @Test
    void searchDuplicateLengthIsEqual() {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[]{7, 0, 3, 9, 8, 1};
        List input = new LinkedList(List.of(1, 3));

        assertEquals(input, Tasks.searchDuplicate(arr1, arr2));
    }

    @Test
    void searchDuplicateLengthNotEqual() {
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{7, 0, 3, 9, 8, 1};
        List input = new LinkedList(List.of(3, 1));

        assertEquals(input, Tasks.searchDuplicate(arr1, arr2));
        arr2 = new int[]{1, 2, 3, 4};
        arr1 = new int[]{7, 0, 3, 9, 8, 1};
        assertEquals(input, Tasks.searchDuplicate(arr1, arr2));
    }

    @Test
    void searchDuplicateThrow() {
        int[] arr1 = null;
        int[] arr2 = new int[]{7, 0, 3, 9, 8, 1};

        assertThrows(RuntimeException.class, () -> Tasks.searchDuplicate(arr1, arr2));

        int[] arrTwo = null;
        int[] arrOne = new int[]{7, 0, 3, 9, 8, 1};
        assertThrows(RuntimeException.class, () -> Tasks.searchDuplicate(arrOne, arrTwo));
    }

    @Test
    void searchDuplicateWithNoCommonElements() {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{6, 7, 8, 9};

        assertEquals(List.of(), Tasks.searchDuplicate(arr1, arr2));
    }

    @Test
    void searchDuplicateWithEmptyArrays() {
        int[] arr1 = new int[]{};
        int[] arr2 = new int[]{};

        assertEquals(List.of(), Tasks.searchDuplicate(arr1, arr2));
    }

    @Test
    void searchDuplicateWithDuplicatesInArrays() {
        int[] arr1 = new int[]{1, 1, 3, 3};
        int[] arr2 = new int[]{3, 1, 2, 5};

        assertEquals(List.of(1, 1, 3, 3), Tasks.searchDuplicate(arr1, arr2));
    }
}