import java.util.ArrayList;
import java.util.List;

public class myMain {
    public List<Integer> main() {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integerList.add(1);
        }

        return integerList;
    }
}
class TestRunnableThread{
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new RunEx());
        thread.start();

        thread.join();

        System.out.println(RunEx.sum);
    }
}
