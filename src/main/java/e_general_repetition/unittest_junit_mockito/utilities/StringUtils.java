package e_general_repetition.unittest_junit_mockito.utilities;

public class StringUtils {

    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

    public boolean isPalindrome(String input) {
        if (input == null) return false;
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(reversed);
    }

    public String toCamelCase(String input) {
        if (input == null || input.isEmpty()) return input;

        String[] parts = input.split("_");
        StringBuilder sb = new StringBuilder(parts[0].toLowerCase());

        for (int i = 1; i < parts.length; i++) {
            sb.append(parts[i].substring(0, 1).toUpperCase())
                    .append(parts[i].substring(1).toLowerCase());
        }

        return sb.toString();
    }
}
