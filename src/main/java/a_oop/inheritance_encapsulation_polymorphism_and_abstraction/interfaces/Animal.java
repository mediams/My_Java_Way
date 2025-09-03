package a_oop.inheritance_encapsulation_polymorphism_and_abstraction.interfaces;

enum FlightStages implements Trackable {
    GROUNDEN, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if (this != GROUNDEN) {
            System.out.println("Monitoring " + this);
        }
    }
}

interface OrbitEarth extends FlightEnable {
    void achieveOrbit();
}

interface FlightEnable {

    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    void takeOff();

    void land();

    void fly();
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
    public void achieveOrbit() {
        System.out.println("Orbit achieved!");
    }

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

public abstract class Animal {
    public abstract void move();
}
