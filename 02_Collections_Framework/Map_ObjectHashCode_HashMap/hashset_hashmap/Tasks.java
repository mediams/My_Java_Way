package hashset_hashmap;

import java.lang.reflect.Array;
import java.util.*;

public class Tasks {
    public static void main(String[] args) {
        //Create a HashMap where the keys are the names of the cities and the values are their populations.
        // Add several cities, then output the population of the city selected by the user.
        HashMap<String, Integer> cites = new HashMap<>();
        cites.put("Lviv", 2_000_000);
        cites.put("New York", 7_530_000);
        cites.put("San Francisco", 1_002_000);

//        Scanner scanner = new Scanner(System.in);
//        String nameOfCity = scanner.nextLine();

//        System.out.println(cites.get(nameOfCity));


        //Create a HashMap with students' names and their scores.
        // Use Map.Entry to count the number of students with scores greater than 40 and output these results.
        HashMap<String, Integer> students = new HashMap<>();
        students.put("John", 42);
        students.put("Mark", 25);
        students.put("Lilu", 16);
        students.put("Jan", 49);
        students.put("Marta", 46);
        int count = 0;
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            if (entry.getValue() > 40) {
                count++;
                System.out.println("Name: " + entry.getKey() + ", scores: " + entry.getValue());
            }
        }
        System.out.println(count);

        //Create a HashMap where the keys are categories of products (e.g. Food, Clothing)
        // and the values are their quantities. Implement a method that will add a product to a category by updating the quantity value.
        HashMap<String, Integer> list = new HashMap<>();
        list.put("Food", 5);
        list.put("Clothing", 9);
        list.put("PC", 6);
        list.put("Ball", 7);

        putList(list, "PC", 16);
        System.out.println(list);

        //Create a HashSet to store unique words from the text.
        // Break the text string into words and add them to the HashSet. Print all unique words.
        String song = "Baby, I want some of your love Your love (your love), your love Baby (baby), can I have some of your love Your love, your love?";
        String[] array = song.replaceAll("[^a-z A-Z]", "").toLowerCase().split(" ");
        System.out.println(Arrays.toString(array));

        Set<String> unique = new HashSet<>();
//        Set<String> unique2 = new HashSet<>(Arrays.asList(array));
        System.out.println(array.length);
        for (String s: array){
            unique.add(s);
        }
        System.out.println(unique);
        System.out.println(unique.size());
    }

    private static void putList(HashMap<String, Integer> list, String s, int i) {
        list.put(s, list.get(s) + i);
    }
}

