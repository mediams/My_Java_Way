package a_oop.inheritance_abstractClasses.transport;

public abstract class Transport {
    private String name;
    private int maxSpeed;

    public Transport(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public abstract void move();

    public abstract void fuelEfficiency();

    public void printDetails(){
        System.out.printf("Name of a car: %s, max Speed: %d", name, maxSpeed);
    }

}
