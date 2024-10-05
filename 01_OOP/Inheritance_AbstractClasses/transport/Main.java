package transport;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Opel", 280, 50);
        car.move();
        car.chargeBattery();
        car.fuelEfficiency();
        System.out.println(car.chargeBattery());
        System.out.println(car);

        Bicycle bicycle = new Bicycle("Hon", 40);
        bicycle.fuelEfficiency();
        bicycle.move();
        System.out.println(bicycle.getMaxSpeed());
    }
}
