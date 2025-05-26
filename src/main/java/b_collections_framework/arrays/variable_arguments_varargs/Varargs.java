package b_collections_framework.arrays.variable_arguments_varargs;

public class Varargs {
    public static void main(String... args) {
        String[] strings = {"Hello", "World", "again"};
        printText(strings);

        System.out.println("-".repeat(30));
        String string = "Hello";
        printText(string);

        System.out.println("-".repeat(30));
        string = "Hello World again";
        printText(string.split(" "));

        System.out.println("-".repeat(30));
        printText(String.join(" ", strings));

        System.out.println("-".repeat(30));
        printText();
    }

    private static void printText(String... args) {
        for (String s : args) {
            System.out.println(s);
        }
    }
}
