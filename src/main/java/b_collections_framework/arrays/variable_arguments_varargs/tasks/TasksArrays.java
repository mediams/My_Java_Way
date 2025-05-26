package b_collections_framework.arrays.variable_arguments_varargs.tasks;

import java.util.Arrays;
import java.util.Random;

public class TasksArrays {
    public static void main(String[] args) {
//        sumOfElements();
//        findMinMax();
//        findOddAndEven();
//        mirrorArray();
        deleteElement();
    }

    private static void deleteElement() {
        int[] arrays = {1, 2, 3, 2, 4};
        int num = 2;
        int findNumber = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == num) {
                findNumber++;
            }
        }
        int[] copyOf = new int[arrays.length - findNumber];
        int index = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] != num) {
                copyOf[index++] = arrays[i];
            }
        }
        System.out.println(Arrays.toString(copyOf));
    }

    private static void mirrorArray() {
        int[] arrays = new int[11];
        Random random = new Random();
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(1, 101);
        }
        System.out.println(Arrays.toString(arrays));
        System.out.println("_".repeat(30));

        for (int i = 0, j = arrays.length - 1; i < arrays.length / 2; i++, j--) {
            int temp = arrays[i];
            arrays[i] = arrays[j];
            arrays[j] = temp;
        }
        System.out.println(Arrays.toString(arrays));
    }

    private static void findOddAndEven() {
        int odd = 0;
        int even = 0;
        int[] arrays = new int[15];
        Random random = new Random();
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(1, 101);
            if (arrays[i] % 2 == 0) {
                even++;
            } else odd++;
        }
        System.out.println(Arrays.toString(arrays));
        System.out.println("Odd number:" + odd + ", even numbers: " + even);
    }

    private static void findMinMax() {
        int[] arrays = new int[10];
        Random random = new Random();
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(1, 101);
        }
        System.out.println(Arrays.toString(arrays));
        int maxNumber = arrays[0];
        int minNumber = arrays[0];

        for (int i = 0; i < arrays.length; i++) {
            if (maxNumber < arrays[i]) {
                maxNumber = arrays[i];
            }
        }
        System.out.printf("Max number: %d", maxNumber);
    }

    private static void sumOfElements() {
        int[] arrays = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum += arrays[i];
        }
        System.out.println(sum);
    }
}
