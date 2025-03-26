package a_oop.polymorphism_referenceTypes.transport;

public abstract class TransportNew {
    private int speed;
    private int capacity;

    public TransportNew(int speed, int capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }

    abstract void move();

    public void displayInfo() {
        System.out.println("speed = " + speed);
        System.out.println("capacity = " + capacity);
    }
}
