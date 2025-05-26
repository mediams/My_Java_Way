package b_collections_framework.arrays.variable_arguments_varargs;

import java.util.Arrays;
import java.util.Scanner;

public class ReadAndFindMinimumElement {
    public static void main(String[] args) {
        int[] integers = readIntegers();
        int i = findMIn(integers);
        if (i == Integer.MIN_VALUE) {
            System.out.println("Arrays is Empty.");
        } else System.out.println("Minimum element is " + i);
    }

    private static int findMIn(int... integers) {
        if (integers == null) {
            return Integer.MIN_VALUE;
        }
        int minNum = integers[0];
        for (int i = 1; i < integers.length; i++) {
            if (minNum > integers[i]) {
                minNum = integers[i];
            }
        }
        return minNum;
    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if (text.isEmpty()) {
            return null;
        }
        String[] arrays = text.split(",");
        int[] integers = new int[arrays.length];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = Integer.parseInt(arrays[i].trim());
        }
        System.out.println(Arrays.toString(integers));
        return integers;
    }

}
