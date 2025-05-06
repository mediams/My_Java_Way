package a_oop.polymorphism_referenceTypes.cars;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("2025 Blue Ferrari 296 GTS");
        runRace(car);

        System.out.println("-------------------");
        Car ferrari = new GasPoweredCar("2025 Blue Ferrari 296 GTS", 15.4, 6);
        runRace(ferrari);

        System.out.println("-------------------");
        var ferrariNewHybrid = new HybridCar("2025 Black Ferrari SF90 Stradale", 16, 8, 8);
        runRace(ferrariNewHybrid);
    }

    private static void runRace(Car car) {
        car.runEngine();
        car.drive();
        car.startEngine();
    }
}


