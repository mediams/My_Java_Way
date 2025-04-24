package e_general_repetition.exceptions;

public class Main {
    public static void main(String[] args) {
        StringUtilities utils = new StringUtilities();
        StringBuilder sb = new StringBuilder();
        while (sb.length() < 10) {
            utils.addChar(sb, 'a');
        }
        System.out.println(sb);

        String s = "abcdefg";
        String result = utils.upperAndPrefix(utils.addString(s));
        System.out.println(result);

    }

}
