package b_collections_framework.arrays;

import java.util.Arrays;
import java.util.Random;

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

        int[] newArray;
        newArray = new int[10];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }
        for (int num : newArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(newArray));

        Object objectsArray = newArray;
        if (objectsArray instanceof int[]) {
            System.out.println("It's int array");
        }
        System.out.println(Arrays.toString((int[]) objectsArray));

        Object[] objects = new Object[10];
        objects[0] = "1";
        objects[1] = 2;
        objects[2] = newArray;

        for (int i = 0; i < objects.length; i++) {
            System.out.print(objects[i] + ", ");
        }

        System.out.println();
        Random random = new Random();
        int len = random.nextInt(20);
        int[] generatedArray = getRandomArray(len);
        System.out.println(Arrays.toString(generatedArray));
        Arrays.sort(generatedArray);
        System.out.println(Arrays.toString(generatedArray));

        int[] emptyArray = new int[10];
        Arrays.fill(emptyArray, 7);
        System.out.println(Arrays.toString(emptyArray));

        int[] copyArray = Arrays.copyOf(emptyArray, emptyArray.length);
        System.out.println(Arrays.toString(copyArray));

        int[] copyArrayTwo = Arrays.copyOf(emptyArray, 15);
        System.out.println(Arrays.toString(copyArrayTwo));
    }

    private static int[] getRandomArray(int len) {
        int[] array = new int[len];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

}
