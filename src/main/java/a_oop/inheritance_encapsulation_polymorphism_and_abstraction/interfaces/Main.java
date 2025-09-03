package a_oop.inheritance_encapsulation_polymorphism_and_abstraction.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnable flier = bird;
        Trackable trackable = bird;

        animal.move();
//        flier.move();
//        trackable.move();
        flier.fly();
        flier.land();
        flier.takeOff();
        trackable.track();

        System.out.println("inFlight");
        inFlight(flier);

        inFlight(new Jet());

        Trackable track = new Track();
        track.track();

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnable.KM_TO_MILES;
        System.out.printf("The truck traveled %20.2f km or %20.2f miles%n", kmsTraveled, milesTraveled);

        ArrayList<FlightEnable> flightEnables = new ArrayList<>();
        flightEnables.add(bird);
        List<FlightEnable> betterFliers = new ArrayList<>();
        betterFliers.add(bird);

        triggerFliers(flightEnables);
        flyFliers(flightEnables);
        landFliers(flightEnables);

        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);
    }

    private static void inFlight(FlightEnable flightEnable) {
        flightEnable.takeOff();
        flightEnable.fly();
        if (flightEnable instanceof Trackable trackable) {
            trackable.track();
        }
        flightEnable.land();
    }

    private static void triggerFliers(List<FlightEnable> fliers) {
        for (var flier : fliers) {
            flier.takeOff();
        }
    }

    private static void flyFliers(List<FlightEnable> fliers) {
        for (var flier : fliers) {
            flier.fly();
        }
    }

    private static void landFliers(List<FlightEnable> fliers) {
        for (var flier : fliers) {
            flier.land();
        }
    }
}
