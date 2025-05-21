package b_collections_framework.arrays;

import java.util.Arrays;

public class ArraysFindAndMatch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 15};
        int num = 10;
        int i = lenearSearch(array, num);
        if (i >= 0) {
            System.out.printf("Number %d is in position %d.%n", num, i);
        } else System.out.printf("Number %d is not founded.", num);

        System.out.println();

        num = 10;
        i = binarySearch(array, num);
        if (i >= 0) {
            System.out.printf("Number %d is in position %d.%n", num, i);
        } else System.out.printf("Number %d is not founded.", num);

        System.out.println("\n" + Arrays.binarySearch(array, 15));

        String[] list = {"John", "Rob", "Steve", "Olaf"};
        Arrays.sort(list);
        if (Arrays.binarySearch(list, "Rob") >= 0) {
            System.out.println("List content this word.");
        }

        int[] arrayOne = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arrayTwo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        if (Arrays.equals(arrayOne, arrayTwo)) {
            System.out.println("Arrays are equals");
        } else System.out.println("Arrays aren't equals");

    }

    private static int binarySearch(int[] array, int i) {
        Arrays.sort(array);
        int indexLeft = 0;
        int indexRight = array.length - 1;

        while (indexLeft <= indexRight) {
            int indexMid = indexLeft + (indexRight - indexLeft) / 2;
            if (array[indexMid] == i) {
                return indexMid;
            } else if (i < array[indexMid]) {
                indexRight = indexMid - 1;
            } else {
                indexLeft = indexMid + 1;
            }
        }
        return -1;
    }

    private static int lenearSearch(int[] array, int num) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
