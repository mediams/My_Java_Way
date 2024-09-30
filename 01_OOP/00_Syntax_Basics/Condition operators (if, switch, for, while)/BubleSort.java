import java.util.Arrays;

public class BubleSort {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 4, 7, 3, 1, 5, 9, 8, 4};
        System.out.println(Arrays.toString(array));


        getSort(array);
        System.out.println(Arrays.toString(array));


    }

    public static int[] getSort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            count++;
            int temp = 0;
            for (int j = 0; j < array.length - 1; j++) {
                count++;
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(count);
        return array;
    }
}
