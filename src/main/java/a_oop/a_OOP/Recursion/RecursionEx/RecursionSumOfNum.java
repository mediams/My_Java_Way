package a_oop.a_OOP.Recursion.RecursionEx;

public class RecursionSumOfNum {
    public static int sumN(int n) { // O(1)
        return n * (n + 1) / 2;
    }

    public static int sumNiteration(int n) {
        int total = 0;
        int i = 1;

        while (i <= n) {
            total = total + i;
            i += 1;
        }

        return total;
    }

    public static int sumNrecursion(int n) { // O(n)
        if (n == 1) {
//            return 1;
            return n;
        }
        return sumNrecursion(n - 1) + n; // 5 4 3 2 1 -> 1 + 2 + 3 + 4 + 5
    }

    public static void main(String[] args) {
        System.out.println(sumNrecursion(5));
    }
}
