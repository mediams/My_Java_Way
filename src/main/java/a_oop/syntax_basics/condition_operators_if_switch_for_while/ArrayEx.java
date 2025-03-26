package a_oop.syntax_basics.condition_operators_if_switch_for_while;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 5;
        array[4] = 6;

        System.out.println(Arrays.toString(array));
        int insertIndex = 3;
        for (int i = array.length - 1; i > 3; i--) {
            array[i] = array[i - 1];
        }
        array[insertIndex] = 4;

        System.out.println(Arrays.toString(array));
    }
}
