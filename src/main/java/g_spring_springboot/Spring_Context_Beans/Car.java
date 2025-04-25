package g_Spring_SpringBoot.Spring_Context_Beans;

public class Car implements Vehicle{
    @Override
    public void move() {
        System.out.println("Car moving ...");
    }
}
