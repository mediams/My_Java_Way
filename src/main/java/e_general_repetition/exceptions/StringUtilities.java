package e_general_repetition.exceptions;

public class StringUtilities {
    private final StringBuilder sBuilder = new StringBuilder();
    private int charAdded = 0;

    public void addChar(StringBuilder sBuilder, char c) {
        sBuilder.append(c);
        charAdded++;
    }

    public String upperAndPrefix(String s) {
        String upper = s.toUpperCase();
        return "Prefix_" + upper;
    }

    public String addString(String s) {
        return s + "_Suffix";
    }
}
