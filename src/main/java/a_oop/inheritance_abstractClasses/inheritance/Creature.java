package a_oop.inheritance_abstractClasses.inheritance;

public abstract class Creature {
    private String name;

    public abstract void introduce();

    public abstract void play(Creature another);

    public String getName() {
        return name;
    }
}
