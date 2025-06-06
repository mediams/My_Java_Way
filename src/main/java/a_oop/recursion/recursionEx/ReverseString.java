package a_oop.recursion.recursionEx;

public class ReverseString {

    private static String reverseString(String string) {
        if (string.isEmpty()) {
            return string;
        }
        return reverseString(string.substring(1)) + string.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }
}
