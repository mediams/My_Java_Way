package a_oop.inheritance_abstractClasses.animal;

public abstract class Animal {
    protected String type;
    private final String size;
    private final double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed);

    public abstract void makeNoise();
}
