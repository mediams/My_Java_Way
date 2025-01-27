package priority;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toUpperCase();

        boolean flag = true;
        do {
            switch (s) {
                case "A":
                    System.out.println("Priority " + Priority.HIGH);
                    break;
                case "B":
                    System.out.println("Priority " + Priority.MEDIUM);
                    break;
                case "C":
                    System.out.println("Priority " + Priority.LOW);
                    break;
                default:
                    flag = false;
                    break;
            }
        } while (!flag);
    }
}
