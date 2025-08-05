package b_collections_framework.LinkedList_Implementation.autoboxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Autoboxing {
    public static void main(String[] args) {
        Integer exampleAutoboxing = Integer.valueOf(15);
//        Integer example2 = Integer(15);
        int unboxedInt = exampleAutoboxing.intValue();

        Integer autoBox = 15;
        int autoUnboxed = autoBox;
        System.out.println(autoBox.getClass().getName());
        System.out.println(autoUnboxed);

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getLiteralDoublePrimitive();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));
        System.out.println(wrapperArray[0].getClass().getSimpleName());

        Character[] characters = {'a', 'b', 'c', 'd'};
        System.out.println(characters[0].getClass().getSimpleName());

        var ourList = getList(1, 2, 3, 4);
        System.out.println(ourList);

    }

    private static ArrayList<Integer> getList(Integer... varargs) {
        ArrayList<Integer> aList = new ArrayList<>();
        Collections.addAll(aList, varargs);
        return aList;
    }

    private static int returnAnInt(Integer integer) {
        return integer;
    }

    private static Integer returnAnInteger(int i) {
        return i;
    }

    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static Double getLiteralDoublePrimitive() {
        return 100.00;
    }
}
