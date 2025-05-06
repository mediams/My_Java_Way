package a_oop.polymorphism_referenceTypes.cars;

public class HybridCar extends Car {
    private double avgPerCharge;
    private int cylinders = 6;
    private int getBatterySize;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgPerCharge, int cylinders, int getBatterySize) {
        super(description);
        this.avgPerCharge = avgPerCharge;
        this.cylinders = cylinders;
        this.getBatterySize = getBatterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("HybridCar Engine is started...\n" +
                "batterySize is " + cylinders + "%");
    }

    @Override
    public void drive() {
        if (cylinders < 10) {
            System.out.println("Charge is needed...");
        }
        System.out.println("HybridCar is moved");
    }

    @Override
    protected void runEngine() {
        if (cylinders <= 0) {
            System.out.println("HybridCar can't move");
            return;
        }
        System.out.println("HybridCar Engine is run...");
    }
}
