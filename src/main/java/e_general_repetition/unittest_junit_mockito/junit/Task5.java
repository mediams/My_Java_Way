package e_general_repetition.unittest_junit_mockito.junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {


    // 5) Напишите метод проверки введенного пароля. Пароль должен иметь от 8 до 15 символов, обязательно содержать цифры,
    //буквы верхнего и нижнего регистра и спецсимволы: ~!#$/\-_.
    public static void main(String[] args) {
        System.out.println(verify("12345678Aa-"));
    }


    public static boolean verify(String s) {
        if (s == null || s.length() < 8 || s.length() > 15) return false;
        String containNumbers = "\\d";
        String containLetters = "[a-z]";
        String containUppercaseLetters = "[A-Z]";
        String containSpecs = "[~!#$_\\-/\\\\]";

        return check(s, containNumbers) && check(s, containLetters)
                && check(s, containUppercaseLetters) && check(s, containSpecs);

    }

    private static boolean check(String s, String regex) {
        Matcher matcher = Pattern.compile(regex).matcher(s);
        return matcher.find();
    }
}
