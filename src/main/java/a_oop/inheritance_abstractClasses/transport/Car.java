package a_oop.inheritance_abstractClasses.transport;

public class Car extends Transport implements ElectricVehicle {
    private int batteryLevel;

    public Car(String name, int maxSpeed, int batteryLevel) {
        super(name, maxSpeed);
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public int chargeBattery() {
        return batteryLevel += 2;
    }

    @Override
    public void move() {
        System.out.println("Transport is moving.");
    }

    @Override
    public void fuelEfficiency() {
        System.out.println("Consumption 5 liters per 100 km.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "batteryLevel=" + batteryLevel +
                '}';
    }
}
