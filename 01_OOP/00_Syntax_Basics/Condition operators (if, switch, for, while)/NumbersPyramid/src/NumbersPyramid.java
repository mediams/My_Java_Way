public class NumbersPyramid {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();


        }
        for (int i = num; i >= 1; i--) {
            for (int j = num; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
