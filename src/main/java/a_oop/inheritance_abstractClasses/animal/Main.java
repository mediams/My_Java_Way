package a_oop.inheritance_abstractClasses.animal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("animal", "big", 100);
        Dog dog = new Dog("Wolf", "big", 100);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepard", "big", 150));
        animals.add(new Fish("Goldfish", "small", 1));
        animals.add(new Dog("Mops", "small", 50));
        animals.add(new Fish("Barracuda", "big", 75));

        animals.add((new Horse("Clydesdale", "large", 1000)));

        for (Animal animal : animals) {
            doAnimalStuff(animal);
            if (animal instanceof Mammal currentMammal) { //New syntax (Java 16+) Pattern Matching
                currentMammal.shedHair();
            }
        }
    }

    private static void doAnimalStuff(Animal animal) {
        animal.move("slow");
        animal.makeNoise();
    }
}
