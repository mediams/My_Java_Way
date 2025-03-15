package a_oop.a_Syntax_Basics.condition_operators_if_switch_for_while;

import java.util.Scanner;

public class MinMaxNumbersLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double min = 0;
        double max = 0;
        int count = 0;

        do {
            System.out.println("Enter number: ");
            String s = scanner.nextLine();
            try {
                double number = Double.parseDouble(s);
                if (count == 0 || number < min) {
                    min = number;
                }
                if (count == 0 || number > max) {
                    max = number;
                }
            } catch (NumberFormatException e) {
                break;
            }
            count++;
        } while (true);
        if (count != 0) {
            System.out.println("min:" + min + ", max:" + max);
        } else {
            System.out.println("No data");
        }
    }
}
