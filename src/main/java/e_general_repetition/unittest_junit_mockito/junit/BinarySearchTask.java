package e_general_repetition.unittest_junit_mockito.junit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTask {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        System.out.println(search(list, "E"));


        System.out.println(Collections.binarySearch(list, "E"));
    }

    public static int search(List<String> list, String key) {  // log (n) for ArrayList
        int startIndex = 0;
        int endIndex = list.size() - 1;
        while (startIndex <= endIndex) { // log (n)
            int middleIndex = startIndex + (endIndex - startIndex) / 2;
            if (key.compareTo(list.get(middleIndex)) > 0) {
                startIndex = middleIndex + 1;
            } else if (key.compareTo(list.get(middleIndex)) < 0) {
                endIndex = middleIndex - 1;
            } else {
                return middleIndex;
            }
        }
        return -1;
    }

}
