package a_oop.polymorphism_referenceTypes.cars;

public class ElectricCar extends Car {
    private double avgPerCharge;
    private final int batterySize = 6;

    public ElectricCar(String description) {
        super(description);
    }


    @Override
    public void startEngine() {
        System.out.println("ElectricCar Engine is started...\n" +
                "batterySize is " + batterySize + "%");
    }

    @Override
    public void drive() {
        if (batterySize < 10) {
            System.out.println("Charge is needed...");
        }
        System.out.println("ElectricCar is moved");
    }

    @Override
    protected void runEngine() {
        if (batterySize <= 0) {
            System.out.println("ElectricCar can't move");
            return;
        }
        System.out.println("ElectricCar Engine is run...");
    }
}
