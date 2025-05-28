package b_collections_framework.arrays;

import java.util.Arrays;

public class tasks {
    public static void main(String[] args) {
        reverseArrays();
        countElements();
    }


    private static void countElements() {
        int[] arr = {7, 2, 2, 3, 1, 4, 1};
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            System.out.println(arr[i] + " found " + count);
        }
    }

    private static void reverseArrays() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
