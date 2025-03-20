package a_oop.inheritance_encapsulation_polymorphism_and_abstraction;

public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog() {
        super("Mutt", "Big", 500);
    }

    public Dog(String type, String size, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight > 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
}
