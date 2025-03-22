package a_oop.Polymorphism_ReferenceTypes.transport;

public class Airplane extends TransportNew{
    public Airplane(int speed, int capacity) {
        super(speed, capacity);
    }

    @Override
    void move() {
        System.out.println("Airplane is flying in the sky");
    }

}
