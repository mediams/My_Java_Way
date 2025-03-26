package g_Spring_SpringBoot.Spring_Context_Beans;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Bike();

        Traveler traveler = new Traveler(vehicle);
        traveler.startJourney();
    }
}
