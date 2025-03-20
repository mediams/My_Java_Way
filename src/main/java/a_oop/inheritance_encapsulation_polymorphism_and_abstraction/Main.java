package a_oop.inheritance_encapsulation_polymorphism_and_abstraction;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("General Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
