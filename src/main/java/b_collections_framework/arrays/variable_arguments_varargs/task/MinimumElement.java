package b_collections_framework.arrays.variable_arguments_varargs.task;

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        int i = readInteger();
        int[] ints = readElements(i);
        int min = findMin(ints);
        System.out.println(min);
    }

    private static int readInteger() {
        System.out.println("how many elements the user needs to enter:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return Integer.parseInt(input);
    }

    private static int[] readElements(int num) {
        Scanner scanner = new Scanner(System.in);
        int[] arrays = new int[num];
        for (int i = 0; i < num; i++) {
            String input = scanner.nextLine();
            arrays[i] = Integer.parseInt(input.trim());
        }
        return arrays;
    }

    private static int findMin(int... integers) {
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
}
