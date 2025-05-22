package b_collections_framework.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysDescOrder {
    public static void main(String[] args) {
        int[] array = getRandomArray();
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sortDescArray(array)));
        System.out.println(Arrays.toString(sortDescArrayTwo(array)));

    }

    private static int[] sortDescArrayTwo(int[] array) {
        int[] copyOf = Arrays.copyOf(array, array.length);
        Arrays.sort(copyOf);
        for (int i = 0, j = copyOf.length - 1; i < j; i++, j--) {
            int temp = copyOf[i];
            copyOf[i] = copyOf[j];
            copyOf[j] = temp;
        }
        return copyOf;
    }

    private static int[] sortDescArray(int[] array) {
        int[] copyOf = Arrays.copyOf(array, array.length);
        for (int i = copyOf.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (copyOf[i] > copyOf[j]) {
                    int temp = copyOf[j];
                    copyOf[j] = copyOf[i];
                    copyOf[i] = temp;
                }
            }
        }
        return copyOf;
    }

    private static int[] getRandomArray() {
        Random random = new Random();
        int len = random.nextInt(20);
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
}
