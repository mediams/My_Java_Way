package TaskEx;

import java.util.ArrayList;
import java.util.List;

public class SynchronizeEx {
    private static int count;

    public static void main(String[] args) throws InterruptedException {
        var threadList = new ArrayList<Thread>();

        int numberOfIncrement = 10_000;

        for (int i = 0; i < numberOfIncrement; i++) {
            var t = new Thread(SynchronizeEx::increment); //var t = new Thread(()->SynchronizeEx.increment());
            threadList.add(t);
            t.start();
        }

        for (Thread thread : threadList) {
            thread.join();
        }

        System.out.println(count);
    }

    public static void increment() {
        count++;
    }
}
