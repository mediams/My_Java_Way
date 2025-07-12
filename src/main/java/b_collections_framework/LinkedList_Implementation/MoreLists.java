package b_collections_framework.LinkedList_Implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);

        System.out.println(list.getClass().getName());
        ArrayList<String> arrayList = new ArrayList<>(list);
        arrayList.add("newElement");
        System.out.println(arrayList);

        ArrayList<String> nextList = new ArrayList<>(List.of("Element1", "Element2", "Element3"));
        nextList.add("Element4");
        System.out.println(nextList);

        System.out.println("Third elemnt = " + nextList.get(2));

        if (nextList.contains("Element3")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        nextList.add("Element4");

        System.out.println(nextList);
        System.out.println("first - " + nextList.indexOf("Element4"));
        System.out.println("last - " + nextList.lastIndexOf("Element4"));
        System.out.println(nextList.get(0));
        System.out.println(nextList);
        nextList.remove("Element4");
        nextList.removeAll(List.of("Element2", "Element3"));
        System.out.println(nextList);
        nextList.remove(0);
        System.out.println(nextList);

        ArrayList<Integer> integerArrayList = new ArrayList<>(List.of(1, 2, 3, 4));
        integerArrayList.remove((Integer) 1);
        System.out.println(integerArrayList);

        integerArrayList.clear();
        System.out.println(integerArrayList);
        System.out.println("Is Empty - " + integerArrayList.isEmpty());

        integerArrayList.addAll(List.of(1, 2, 3));
        integerArrayList.addAll(Arrays.asList(5, 4, 0, 10));

        System.out.println(integerArrayList);
        integerArrayList.sort(Comparator.naturalOrder());
        System.out.println(integerArrayList);

        integerArrayList.sort(Comparator.reverseOrder());
        System.out.println(integerArrayList);

        var array = integerArrayList.toArray(new Integer[integerArrayList.size()]);
        System.out.println(Arrays.toString(array));
    }
}
