package a_oop.polymorphism_referenceTypes.transport;

public class CarNew extends TransportNew implements Repairable{
    public CarNew(int speed, int capacity) {
        super(speed, capacity);
    }

    @Override
    void move() {
        System.out.println("Car is moving.");
    }

    @Override
    public void repair() {
        System.out.println("The car is being repaired");
    }
}
