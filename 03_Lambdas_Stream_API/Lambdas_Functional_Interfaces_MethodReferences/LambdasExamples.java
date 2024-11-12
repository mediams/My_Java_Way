import java.util.Comparator;

public class LambdasExamples {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from runnable");
            }
        };
        new Thread(runnable).start();

        Runnable runnableNew = () -> System.out.println("Hello from runnable2");
        new Thread(runnableNew).start();

        Runnable runnable1 = () -> System.out.println("Test");
        new Thread(runnable1).start();


        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };

        Comparator<String> comparatorLambda = (s1, s2) -> s1.length() - s2.length();


    }
}
