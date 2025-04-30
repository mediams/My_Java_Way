package a_oop.polymorphism_referenceTypes.cars;

public class Car {
    private final String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Engine started...");
    }

    public void drive() {
        System.out.println("Car is moved..." + getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Engine is runned...");
    }
}
