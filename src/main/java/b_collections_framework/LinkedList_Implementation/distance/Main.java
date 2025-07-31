package b_collections_framework.LinkedList_Implementation.distance;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean check = false;
        var scanner = new Scanner(System.in);
        var townsList = new LinkedList<Town>();

        townsList.add(new Town("Adelaide", 1374));
        townsList.add(new Town("Alice Springs", 2771));
        townsList.add(new Town("Brisbane", 917));
        townsList.add(new Town("Darwin", 3972));
        townsList.add(new Town("Melbourne", 877));
        townsList.add(new Town("Perth", 3923));
        townsList.add(new Town("Sydney", 0));
        var iterator = townsList.listIterator();
        printMenu();


        while (!check) {
            System.out.println("Enter your choise: ");
            String choise = scanner.nextLine();
            switch (choise.toUpperCase()) {
                case "F" -> moveCursor(iterator, 1);
                case "B" -> moveCursor(iterator, 2);
                case "L" -> Town.printList(townsList);
                case "M" -> printMenu();
                default -> check = false;
            }
        }
    }

    private static void moveCursor(ListIterator<Town> iterator, int key) {
        if (iterator.hasNext() && key == 1) {
            Town town = iterator.next();
            System.out.println(town.getName() + " " + town.getDistance());
        } else if (iterator.hasPrevious() && key == 2) {
            Town town = iterator.previous();
            System.out.println(town.getName() + " " + town.getDistance());
        }
    }

    private static void printMenu() {
        System.out.println("""
                Available actions (select word or letter) :
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""");
    }

}
