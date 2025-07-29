package b_collections_framework.LinkedList_Implementation;

import java.util.LinkedList;

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

        String p4 = list.pop();
        System.out.println(p4 + " was removed");

    }
}
