package b_collections_framework.arrays.hw;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        int len = 5;
        int[] originalArray = getIntegers(len);
        printArray(originalArray);
        System.out.println();
        int[] sortDescIntegers = sortIntegers(originalArray);
        printArray(sortDescIntegers);
    }

    public static void printArray(int[] originalArray) {
        for (int i = 0; i < originalArray.length; i++) {
            System.out.println("Element " + i + " contents " + originalArray[i]);
        }
    }

    public static int[] sortIntegers(int[] integers) {
        int[] copyOfArray = Arrays.copyOf(integers, integers.length);
        Arrays.sort(copyOfArray);
        for (int i = 0, j = copyOfArray.length - 1; i < j; i++, j--) {
            int t = copyOfArray[i];
            copyOfArray[i] = copyOfArray[j];
            copyOfArray[j] = t;
        }
        return copyOfArray;
    }

    public static int[] getIntegers(int len) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

}
