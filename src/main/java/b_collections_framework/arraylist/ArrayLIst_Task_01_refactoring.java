package b_collections_framework.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayLIst_Task_01_refactoring {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();

        while (flag) {
            printInfo();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }

    }

    private static void addItems(ArrayList<String> groceries) {
        System.out.println("Add item(s) [separate items by comma]: ");
        String[] items = scanner.nextLine().split(",");
//        groceries.addAll(List.of(items));
        for (String i : items) {
            String trimmed = i.trim();
            if (!groceries.contains(trimmed)) {
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries) {
        System.out.println("Remove item(s) [separate items by comma]: ");
        String[] items = scanner.nextLine().split(",");
        for (String i : items) {
            String trimmed = i.trim();
            groceries.remove(trimmed);
        }
    }

    private static void printInfo() {
        String text = """
                0 - to quit
                1 - to add items
                2 - to remove items
                                
                Enter a number for which action you want to do:""";

        System.out.println(text + " ");
    }
}
