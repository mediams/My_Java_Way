package b_collections_framework.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ArrayList_Task_01 {
    public static ArrayList<String> list = new ArrayList<>(List.of());

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            boolean correct = false;

            while (!correct) {
                System.out.println("Enter your choice: ");
                System.out.println("Available actions:\n" +
                        "0 - to shutdown\n" +
                        "1 - to add item(s) to list (comma-separated list)\n" +
                        "2 - to remove any items (comma delimited list)");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 0) {
                    break;
                } else if (choice == 1) {
                    System.out.println("Enter your purchase list through a comma.\n");
                    addToList(scanner);
                } else if (choice == 2) {
                    System.out.println("Enter the elements through a comma that you want to remove.\n");
                    removeFromList(scanner);
                } else correct = false;
            }
        }
    }

    private static void removeFromList(Scanner scanner) {
        ArrayList<String> originalList = ArrayList_Task_01.list;
        scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().split(",");
        for (String item : split) {
            originalList.remove(item.trim());
        }
        System.out.println(originalList);
    }

    public static void addToList(Scanner scanner) {
        ArrayList<String> originalList = ArrayList_Task_01.list;
        scanner = new Scanner(System.in);
        String list = scanner.nextLine();
        String[] split = list.split(",");
        for (String item : split) {
            if (!originalList.contains(item.trim())) {
                originalList.add(item.trim());
            }
        }
        originalList.sort(Comparator.naturalOrder());
        System.out.println(originalList);
    }
}
