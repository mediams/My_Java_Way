package e_general_repetition.unittest_junit_mockito.utilities;

public class Main {

    public static void main(String[] args) {
        Utilities utilities = new Utilities();
        System.out.println(utilities.removePairs("AABBCDEEFFJ"));
        System.out.println(utilities.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 3));

    }
}
