package a_oop.Inheritance_AbstractClasses.bird;

public class Main {
    public static void main(String[] args) {
        Mockingjay m = new Mockingjay();
        m.setAge(19);
        m.setSpecies("new");
        System.out.println(m.getAge());
        m.fly();
    }
}
