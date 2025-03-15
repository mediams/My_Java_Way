package a_oop.a_Syntax_Basics.condition_operators_if_switch_for_while;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetFivesNumbersFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five numbers.");
        int count = 1;
        int sum = 0;
        do {
            System.out.printf("Enter number #%d:", count);
            String number = scanner.nextLine();
            try {
                int num = Integer.parseInt(number);
                count++;
                sum += num;
            } catch (NumberFormatException exception) {
                System.out.println("Error");
            }

        } while (count <= 5);

        System.out.println(sum);
    }
}
