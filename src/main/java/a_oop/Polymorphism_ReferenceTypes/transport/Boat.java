package transport;

public class Boat extends TransportNew implements Repairable{
    public Boat(int speed, int capacity) {
        super(speed, capacity);
    }

    @Override
    void move() {
        System.out.println("Boat floating on water.");
    }

    @Override
    public void repair() {
        System.out.println("The boat is being repaired");
    }
}
