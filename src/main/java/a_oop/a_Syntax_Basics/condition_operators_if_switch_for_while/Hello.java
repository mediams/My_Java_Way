package a_oop.a_Syntax_Basics.condition_operators_if_switch_for_while;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Yevhen");

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It's not Alien!");

        int topScore = 100;
        if (topScore >= 100) {
            System.out.println(topScore);
        }

        if (isAlien && topScore > 100) {
            System.out.println("Yes");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("!");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        String s = (isDomestic) ? "True" : "False";
        System.out.println(s);

        s = (2 > 3) ? "true" : "false";
        System.out.println(s);

        double number = 20.00;
        double numberTwo = 80.00;
        double sum = (number + numberTwo) * 100.00;
        double result = sum % 40.00;
        boolean flag = result == 0.00 ? true : false;
        System.out.println(flag);
        s = flag ? "true" : "false";
        System.out.println(s);

        int numberT = 257;
        int sumT = 0;

        while (numberT > 0) {
            sumT += numberT % 10;
            numberT = numberT / 10;
        }

        System.out.println("sum: " + sumT);
    }
}
