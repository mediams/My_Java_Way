package a_oop.a_OOP.Recursion.RecursionEx;

public class RecursionTreeEx {
    public static void main(String[] args) {
        calculate(3);
        System.out.println("--------------");
        calculateHead(3);
        System.out.println("--------------");
        calculateTeil(3);

    }

    private static void calculateTeil(int i) {
        if (i > 0) {
            System.out.println(i); // 3 2 1
            calculateTeil(i - 1);
        }
    }

    private static void calculateHead(int i) {
        if (i > 0) {
            calculateHead(i - 1); //3 2 1
            System.out.println(i);
        }
    }

    private static void calculate(int i) {
        if (i > 0) {
            calculate(i - 1); //3
            int k = i * i;
            System.out.println(k);
            calculate(i - 1);
        }

    }
}
