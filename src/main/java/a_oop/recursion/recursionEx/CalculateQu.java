package a_oop.recursion.recursionEx;

public class CalculateQu {
    public static void main(String[] args) {
        calculateItarative(4);
        calculateRecursion(4);
        calculateRecursionHead(4);
    }

    private static void calculateRecursionHead(int i) {
        if (i > 0) {
            calculateRecursionHead(i - 1);
            System.out.println(i * i);
        }

    }

    private static void calculateRecursion(int i) {
        if (i > 0) {
            System.out.println(i * i);
            calculateRecursion(i - 1);
        }
    }

    private static void calculateItarative(int i) {
        while (i > 0) {
            System.out.println(i * i);
            i -= 1;
        }
    }


}
