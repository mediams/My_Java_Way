package b_collections_framework.LinkedList_Implementation;

import java.util.LinkedList;
import java.util.ListIterator;

public class TaskLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();
        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Moscow");
        System.out.println(placesToVisit);

        addMoreElement(placesToVisit);
        System.out.println(placesToVisit);

        removeMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        getElements(placesToVisit);

        printItenerary(placesToVisit);

        testIterator(placesToVisit);
        printItenerary(placesToVisit);
    }

    private static void addMoreElement(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addLast("Hobart");

        //Queue methods
        list.offer("Malborn");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

        //Stack methods
        list.push("Alice Springs");

    }

    private static void removeMoreElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");

        String s1 = list.remove();
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast();
        System.out.println(s3 + " was removed");

//        Queue / Deque methods
        String p1 = list.poll();
        System.out.println(p1 + " was removed");

        String p2 = list.pollFirst();
        System.out.println(p2 + " was removed");

        String p3 = list.pollLast();
        System.out.println(p3 + " was removed");

        list.push("Sydney");
        System.out.println(list);
        list.push("Moscow");
        System.out.println(list);
        list.push("Toowoomba");
        System.out.println(list);
        list.push("Alice Springs");
        list.addFirst("Darwin");
        list.addLast("Hobart");

        String p4 = list.pop();
        System.out.println(p4 + " was removed");

    }

    private static void getElements(LinkedList<String> list) {
        System.out.println("Retrieved Element " + list.get(1));
        System.out.println("First Element " + list.getFirst());
        System.out.println("Last Element " + list.getLast());

        System.out.println("Sydney is at position: " + list.indexOf("Sydney"));

//        Queue retrieval method
        System.out.println("Element from element() = " + list.element());
//        Queue retrieval method
        System.out.println("Element from peek = " + list.peek());
        System.out.println("Element from peek = " + list.peekFirst());
        System.out.println("Element from peek = " + list.peekLast());

    }

    private static void printItenerary(LinkedList<String> list) {
        System.out.println("Trip starts at: " + list.getFirst());


//        for (int i = 1; i < list.size(); i++) {
//            System.out.println(" --> From: " + list.get(i - 1) + " to " + list.get(i));
//        }
        String previostown = list.getFirst();
//        for (String i : list) {
//            System.out.println(" --> From: " + previostown + " to " + i);
//            previostown = i;
//
//        }

        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            String town = iterator.next();
            System.out.println(" --> From: " + previostown + " to " + town);
            previostown = town;
        }
        System.out.println("Trip ends at: " + list.getLast());

    }

    private static void testIterator(LinkedList<String> list) {
        var iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Moscow")) {
                iterator.add("New city");
            }
        }

        var iterator2 = list.listIterator(2);
        while (iterator2.hasPrevious()) {
            System.out.println(iterator2.previous());
        }
    }
}
