package GenericDemo;



public class GenericDemo1 {
    public static void main(String[] args) {
//        String[] array = {"One", "Two"};
        Integer [] array = {1,2};
        printArray(array);
    }

    private static void printArray(String[] array) {
        for (String s : array){
            System.out.println(s);
        }
    }

    private static <E>void printArray(E[] array) {
        for (E s : array){
            System.out.println((String) s.);
        }
    }
}
