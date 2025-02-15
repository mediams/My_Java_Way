public class FirstMultithreadingProgram extends Thread {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                    System.out.println("I'm a new thread! My name is " + Thread.currentThread().getName());
            }
        };

        Thread t0 = new Thread(task);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm a new thread! My names is " + Thread.currentThread().getName());
            }
        });

        Thread t2 = new FirstMultithreadingProgram();

        t0.start();
        t1.start();

        Thread t = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Running...");
            }
        });
        t.start();
        t.interrupt();


    }
}
