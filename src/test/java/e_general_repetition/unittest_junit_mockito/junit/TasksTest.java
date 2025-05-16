package e_general_repetition.unittest_junit_mockito.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TasksTest {
    @Test
    void searchDuplicateLengthIsEqual() {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[]{7, 0, 3, 9, 8, 1};

        assertArrayEquals(new int[]{1, 3}, Tasks.searchDuplicate(arr1, arr2));
    }

    @Test
    void searchDuplicateLengthNotEqual() {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {7, 0, 3, 9, 8, 1};

        assertArrayEquals(new int[]{3, 1}, Tasks.searchDuplicate(arr1, arr2));
        arr2 = new int[]{1, 2, 3, 4};
        arr1 = new int[]{7, 0, 3, 9, 8, 1};
        assertArrayEquals(new int[]{3, 1}, Tasks.searchDuplicate(arr1, arr2));
    }

    @Test
    void searchDuplicateThrow() {
        int[] arr1 = null;
        int[] arr2 = {7, 0, 3, 9, 8, 1};

        assertThrows(RuntimeException.class, () -> Tasks.searchDuplicate(arr1, arr2));

        int[] arrTwo = null;
        int[] arrOne = {7, 0, 3, 9, 8, 1};
        assertThrows(RuntimeException.class, () -> Tasks.searchDuplicate(arrOne, arrTwo));
    }

    @Test
    void searchDuplicateWithNoCommonElements() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9};

        assertArrayEquals(new int[]{}, Tasks.searchDuplicate(arr1, arr2));
    }

    @Test
    void searchDuplicateWithEmptyArrays() {
        int[] arr1 = {};
        int[] arr2 = {};

        assertArrayEquals(new int[]{}, Tasks.searchDuplicate(arr1, arr2));
    }

    @Test
    void searchDuplicateWithDuplicatesInArrays() {
        int[] arr1 = {1, 1, 3, 3};
        int[] arr2 = {3, 1, 2, 5};

        assertArrayEquals(new int[]{1, 1, 3, 3}, Tasks.searchDuplicate(arr1, arr2));
    }

    @Test
    void deleteDuplicates() {
        int[] arr = {1, 2, 1, 3, 2, 4, 5, 8};

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 8}, Tasks.deleteDuplicates(arr));
    }

    @Test
    void deleteDuplicatesIsEmpty() {
        int[] arr = {};

        assertArrayEquals(new int[]{}, Tasks.deleteDuplicates(arr));
    }

    @Test
    void deleteDuplicatesIsNull() {
        int[] arr = null;

        assertThrows(RuntimeException.class, () -> Tasks.deleteDuplicates(arr));
    }
}