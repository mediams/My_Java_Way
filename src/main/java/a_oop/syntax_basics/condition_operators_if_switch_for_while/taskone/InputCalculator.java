package a_oop.syntax_basics.condition_operators_if_switch_for_while.taskone;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        long avg = 0L;

        do {
            String input = scanner.nextLine();

            try {
                count++;
                int number = Integer.parseInt(input);
                sum += number;
                avg = count > 0 ? Math.round((double) sum / count) : 0;

            } catch (NumberFormatException e) {
                break;
            }
        } while (true);

        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
