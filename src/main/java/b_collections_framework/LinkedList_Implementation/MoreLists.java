package b_collections_framework.LinkedList_Implementation;

import java.util.ArrayList;
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
    }
}
