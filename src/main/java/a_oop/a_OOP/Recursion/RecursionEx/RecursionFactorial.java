package a_oop.a_OOP.Recursion.RecursionEx;

public class RecursionFactorial {
    public static void main(String[] args) {
        System.out.println(factorialIteration(5));
        System.out.println(factorialRecursion(5));
    }

    private static int factorialRecursion(int n) {
        if (n == 1) {
            return n;
        }
        return factorialRecursion(n - 1) * n;
    }

    private static int factorialIteration(int n) {
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total = i * total;
        }
        return total;
    }
}
