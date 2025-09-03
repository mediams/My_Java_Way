package a_oop.inheritance_encapsulation_polymorphism_and_abstraction.interfaces;

public class Track implements Trackable {

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates recorded");

    }
}
