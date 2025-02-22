package a_oop.a_Syntax_Basics.operators;

public class Main {
    public static void main(String[] args) {
        int highScore = 50;
        boolean flag = false;

        if (highScore > 25) {
            highScore = 1000 + highScore;
        }

        int health = 100;

        if ((health < 25) && (highScore > 1000)) {
            highScore = health - 1000;
        } else {
            System.out.println("Got here");
        }

        System.out.println(health--);
        System.out.println(health--);

        if (flag) {
            System.out.println(flag);
        }

        System.out.printf("Calculate %d", calculate(2, 3));
    }

    private static int calculate(int a, int b) {
        return a * b;
    }

}
