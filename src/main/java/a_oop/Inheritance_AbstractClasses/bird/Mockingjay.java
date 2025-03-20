package a_oop.Inheritance_AbstractClasses.bird;

public class Mockingjay extends Bird {

    @Override
    public void fly() {
        System.out.println(Bird.getSpecies() + ", You can fly!");

    }
}
