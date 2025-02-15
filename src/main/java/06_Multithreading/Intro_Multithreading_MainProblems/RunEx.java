import java.util.List;

public class RunEx implements Runnable {
    static int sum = 0;

    @Override
    public void run() {
        myMain myMain = new myMain();
        List<Integer> main = myMain.main();
        for (int i = 0; i < main.size() / 2; i++) {
            sum += main.get(i);
        }

    }
}
