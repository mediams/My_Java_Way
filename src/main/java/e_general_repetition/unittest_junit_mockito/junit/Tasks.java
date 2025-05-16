package e_general_repetition.unittest_junit_mockito.junit;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Tasks {
    public static int[] searchDuplicate(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) throw new RuntimeException("Array is null");
        int[] firstArr;
        int[] secondArr;
        int step = 0;

        if (arr1.length >= arr2.length) {
            firstArr = arr1;
            secondArr = arr2;
        } else {
            firstArr = arr2;
            secondArr = arr1;
        }

        List<Integer> inputArr = new LinkedList<>();

        for (int i = 0; i < firstArr.length; i++) {
            for (int j = 0; j < secondArr.length; j++) {
                if (firstArr[i] == secondArr[j]) {
                    inputArr.add(step, firstArr[i]);
                    step++;
                }
            }
        }

        int[] result = new int[inputArr.size()];
        int i = 0;
        for (int num : inputArr) {
            result[i++] = num;
        }
        return result;
    }

    public static int[] deleteDuplicates(int[] arr) {
        if (arr == null) throw new RuntimeException("Array is null");

        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }
}
