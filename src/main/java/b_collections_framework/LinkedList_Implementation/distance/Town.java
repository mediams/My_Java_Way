package b_collections_framework.LinkedList_Implementation.distance;

import java.util.LinkedList;

public class Town {
    private final String name;
    private final int distance;

    public Town(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public static void printList(LinkedList<Town> list) {
        System.out.println("\nTown \t\t\tDistance\n");
        for (Town town : list) {
            System.out.println(town.getName() + "\t\t" + town.getDistance());
        }
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }
}
