package a_oop.inheritance_abstractClasses.animal;

public class Dog extends Mammal {

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed == "slow") {
            System.out.print(getExplicitType() + " walking");
        } else {
            System.out.println(getExplicitType() + " running");
        }
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " shed hair all the time");
    }

    @Override
    public void makeNoise() {
        if (type == "Wolf") {
            System.out.println("Howling");
        } else {
            System.out.println("Woof");
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


}
