package b_collections_framework.arrays;

import java.util.Arrays;

public class ArraysLesson {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] arrayTwo = new int[]{1, 2, 3, 4, 5};
        int[] arrayThree = {9, 8, 7, 6, 5, 4};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayTwo));
        System.out.println(Arrays.toString(arrayThree));

        for (int num : array) {
            System.out.println(num);
        }
    }
}
