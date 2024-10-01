package bird;

public abstract class Bird {
    private static String species;
    private int age;

    public abstract void fly();

    public static String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
