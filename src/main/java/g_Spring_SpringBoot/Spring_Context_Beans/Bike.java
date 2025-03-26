package g_Spring_SpringBoot.Spring_Context_Beans;

public class Bike implements Vehicle{
    @Override
    public void move() {
        System.out.println("Bike moving...");
    }
}
