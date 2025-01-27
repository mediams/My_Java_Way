package priority;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        setPriority(sc);
        sc.close();

    }

    private static void setPriority(Scanner sc) {
        while(true) {
            try {
                System.out.println("Enter ‘A’, ‘B’, ‘C’ or ‘D’:");
                String input = sc.nextLine().toUpperCase();
                MessageType type = MessageType.valueOf(input);
                System.out.println("Priority: " + type);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input, please try again.");
            }
        }
    }
}
