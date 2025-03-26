package a_oop.syntax_basics.variables_data_types;

public class Variables {
    public static void main(String[] args) {
        int myIntValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        int newInt = myIntValue + 1;
        System.out.println(newInt);
        System.out.println(myIntValue);
        System.out.println(minValue);
        double maxValue = Double.MAX_VALUE;
        System.out.println(maxValue);

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println(Long.SIZE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        System.out.println("-------------");
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 50_000L + (b + s + (long) i) * 10L;

        System.out.println(l);

        System.out.println();

        float myFloat = 5.25f;
        System.out.println(myFloat);

        System.out.println((5f / 2f));
        System.out.println(7f / 3f);
        System.out.println(7d / 3d);

        double pound = 0.45359237;
        System.out.println(200 * pound);
        System.out.println(0.5 * pound);

        char myChar = 'c';
        System.out.println('\u0044');
        myChar = 68;
        System.out.println(myChar);

        System.out.println("**********");
        char charOne = 'a';
        System.out.println(charOne * 2); //97 * 2
        System.out.println(charOne + 2);

        int result = 10;
        result -= 5;
        System.out.println(result);

    }
}
