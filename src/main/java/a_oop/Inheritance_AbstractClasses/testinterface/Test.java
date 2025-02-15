package testinterface;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Person person = new Person("Bob");
        animal.sleep();
        person.sayHello();

//        Info animal = new Animal(1);
//        Info person = new Person("Bob");


        animal.showInfo();
        person.showInfo();

        outputInfo(animal);
        outputInfo(person);

    }
    public static void outputInfo(Info info){
        info.showInfo();
    }
}
