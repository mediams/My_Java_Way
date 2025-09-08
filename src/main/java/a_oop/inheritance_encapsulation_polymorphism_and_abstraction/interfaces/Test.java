package a_oop.inheritance_encapsulation_polymorphism_and_abstraction.interfaces;

public class Test {
    public static void main(String[] args) {
        inFlight(new Jet());
    }

    private static void inFlight(FlightEnable flightEnable) {
        flightEnable.takeOff();
        flightEnable.transaction(FlightStages.CRUISE);
        flightEnable.fly();
        if (flightEnable instanceof Trackable trackable) {
            trackable.track();
        }
        flightEnable.land();
    }
}
