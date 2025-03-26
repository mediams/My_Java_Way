package g_Spring_SpringBoot.Spring_Context_Beans;

public class Traveler {
    private Vehicle vehicle;

    public Traveler(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    void startJourney() {
        vehicle.move();
    }
}
