package arraylists;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("bananen");
        list.add("apple");
        list.add("kiwi");

        System.out.println("List of: " + list);

        String fruit = list.get(1);
        System.out.println(fruit);

        list.remove(0);
        System.out.println(list);


    }
}
