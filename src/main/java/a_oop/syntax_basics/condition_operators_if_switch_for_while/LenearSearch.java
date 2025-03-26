package a_oop.syntax_basics.condition_operators_if_switch_for_while;

public class LenearSearch {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 5, 4, 3, 7, 6};
        int key = 0;
        for (int i = 0; i < array.length; i++) {
            key = 10;
            if (key == array[i]) {
                System.out.println("Key founded in position: " + (i + 1));
                break;
            } else key = -1;
        }
        if (key == -1) {
            System.out.println("Key not found!");
        }
    }
}
