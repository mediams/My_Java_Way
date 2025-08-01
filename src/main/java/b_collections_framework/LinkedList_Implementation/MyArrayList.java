package b_collections_framework.LinkedList_Implementation;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class MyArrayList {
    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("apples2", "PRODUCE2", 12);

        System.out.println(Arrays.toString(groceryArray));
        for (Object o : groceryArray) {
            System.out.println(o);
        }

        ArrayList objectList = new ArrayList<>();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(0, new GroceryItem("Brot"));
        groceryList.set(0, new GroceryItem("Eis", "Product", 12));
        groceryList.remove(1);
        System.out.println(groceryList);

        for (GroceryItem i : groceryList) {
            System.out.println(i);
        }
    }
}
