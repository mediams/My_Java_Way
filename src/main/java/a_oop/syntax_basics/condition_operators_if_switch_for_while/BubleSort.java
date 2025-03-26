package a_oop.syntax_basics.condition_operators_if_switch_for_while;

import java.util.Arrays;

public class BubleSort {
    public static void main(String[] args) {
        int[] array = new int[]{9, 2, 4, 7, 3, 1, 5, 1, 8, 4};
        System.out.println(Arrays.toString(array));


        getSort(array);
        System.out.println(Arrays.toString(array));

        array = new int[]{1, 2, 4, 7, 3, 1, 5, 9, 8, 4};
        getSortWithBoolean(array);
        System.out.println(Arrays.toString(array));

        array = new int[]{1, 2, 4, 7, 3, 1, 5, 9, 8, 4};
        getSortWithBooleanAndMinus(array);
        System.out.println(Arrays.toString(array));


    }

    public static int[] getSort(int[] array) {

        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println(Arrays.toString(array) + "loop for 1");
            count++;
            int temp = 0;
            for (int j = 0; j < array.length - 1; j++) {
                count++;
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    System.out.println(Arrays.toString(array) + "loop for 2");
                }
            }
        }
        System.out.println(count);
        return array;
    }

    public static int[] getSortWithBoolean(int[] array) {
        boolean check = false;
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            check = true;
            count++;
            int temp = 0;
            for (int j = 0; j < array.length - 1; j++) {
                count++;
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    check = false;
                }
            }
            if (check) break;
        }
        System.out.println(count);
        return array;
    }

    public static int[] getSortWithBooleanAndMinus(int[] array) {
        boolean check = false;
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            check = true;
            count++;
            int temp = 0;
            for (int j = 0; j < array.length - 1 - i; j++) {
                count++;
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    check = false;
                }

            }
            if (check) {
                break;
            }
        }
        System.out.println(count);
        return array;
    }
}
