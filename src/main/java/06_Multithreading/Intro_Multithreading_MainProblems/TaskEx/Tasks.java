import java.util.concurrent.TimeUnit;

public class Tasks {
    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> System.out.println("Hello")).start();

        Thread thread = new Thread(() -> System.out.println("Hi!"));
        System.out.println(thread.getState());

        thread.start();
        System.out.println(thread.getState());

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Whats up!");
            }
        };
        new Thread(runnable).start();

        TimeUnit.SECONDS.sleep(2);
        Runnable task = () -> System.out.println("Task execute");
        new Thread(task).start();

        Thread t = new Thread();
        t.setName("MyThread");
        t.setPriority(Thread.MAX_PRIORITY);

        System.out.println(t);
        System.out.println(Thread.currentThread().getName());

        Thread newThread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("running...");
            }
        });
        newThread.start();
        TimeUnit.MILLISECONDS.sleep(1);
        newThread.interrupt();

        System.out.println(Thread.currentThread().getName());
    }
}
