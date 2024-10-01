package testinterface;

public class Animal implements Info {
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep(){
        System.out.println("I am sleeping.");
    }

    @Override
    public void showInfo() {
        System.out.printf("My id is %d.\n", id);
    }
}
