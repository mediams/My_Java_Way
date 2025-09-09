package a_oop.inheritance_encapsulation_polymorphism_and_abstraction.interfaces;

enum FlightStages implements Trackable {
    GROUNDEN, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if (this != GROUNDEN) {
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNextStage() {
        FlightStages[] allStages = values();
        int i = (ordinal() + 1) % allStages.length;
        return allStages[i];
    }
}

interface OrbitEarth extends FlightEnable {
    void achieveOrbit();

    private static void log(String description) {
        var today = new java.util.Date();
        System.out.println(today + " : " + description);
    }

    private void logStage(FlightStages stage, String description) {
        description = stage + " : " + description;
        log(description);
    }

    @Override
    default FlightStages transaction(FlightStages stage) {
        FlightStages nextStage = FlightEnable.super.transaction(stage);
        logStage(stage, "Beginning Transition to " + nextStage);
        return nextStage;
    }
}

interface FlightEnable {

    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    void takeOff();

    void land();

    void fly();


    default FlightStages transaction(FlightStages stage) {
//        System.out.println("transaction not implemented on " + getClass().getSimpleName());
//        return null;
        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return nextStage;
    }


}

interface Trackable {
    void track();
}

record DragonFly(String name, String type) implements FlightEnable {

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }


}

class Satellite implements OrbitEarth {
    FlightStages stage = FlightStages.GROUNDEN;
    public void achieveOrbit() {
        transition("Orbit achieved!");
    }

    @Override
    public void takeOff() {
        transition("Taking off");
    }

    @Override
    public void land() {
        transition("Landing");
    }

    @Override
    public void fly() {
        achieveOrbit();
        transition("Data Collection while Orbiting");
    }

    public void transition(String description) {
        System.out.println(description);
        stage = transaction(stage);
        stage.track();
    }

    @Override
    public String toString() {
        return "Satellite{}";
    }

}

public abstract class Animal {
    public abstract void move();
}
