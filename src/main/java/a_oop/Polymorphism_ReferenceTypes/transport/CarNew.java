package a_oop.Polymorphism_ReferenceTypes.transport;

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
