package transport;

public class Bicycle extends Transport {
    public Bicycle(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("Bicycle is moving.");
    }

    @Override
    public void fuelEfficiency() {
        System.out.println("Consumption 0 liters per 100 km.");
    }
}
