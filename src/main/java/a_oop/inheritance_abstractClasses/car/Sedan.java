package car;

public class Sedan extends Car{

    @Override
    public void gas() {
        System.out.println("Sedan gibt Gas!");
    }

    @Override
    public void brake() {
        System.out.println("Das Auto bremst.");
    }
}
