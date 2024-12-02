import java.io.File;
import java.io.IOException;

public class DemoEx {
    public static void main(String[] args) {
        File file = new File("test.txt");
        file.mkdir();
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("Is exist? : " + file.exists());
        System.out.println(file.getAbsoluteFile());
    }
}
