package LinkedListTasks;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(List.of(1, 4, 3, 2, 1, 2, 2, 0));
        int element = 2;
        findLastAndFirstElement(linkedList, element);
    }

    private static void findLastAndFirstElement(LinkedList<Integer> linkedList, int element) {
        ListIterator<Integer> list = linkedList.listIterator();
        boolean temp = false;
        while (list.hasNext()) {
            int i = list.next();
            if (i == element && !temp) {
                temp = true;
                System.out.println("Habe gefunden erstes '" + element + "' on index: " + list.previousIndex());
            }
        }
        temp = false;
        while (list.hasPrevious()) {
            int i = list.previous();
            if (i == element && !temp) {
                temp = true;
                System.out.println("Habe gefunden letztes '" + element + "' on index: " + list.nextIndex());
            }
        }
    }
}
/*
Write a method to get the first and last occurrence of the specified items in a linked list.
input:
list = {1, 4, 3, 2, 1, 2, 2, 0}, element = 2
output:
3 (index of the first occurrence), 6 (index of the last occurrence)
 */
