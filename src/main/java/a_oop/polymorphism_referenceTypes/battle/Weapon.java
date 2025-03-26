package battle;

import java.util.Random;

public class Weapon {

    private String name;
    private int force;

    public Weapon(String name, int force) {
        this.name = name;
        this.force = force;
    }

    public Weapon() {
//        getRandomWeapon();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", force=" + force +
                '}';
    }

    public static Weapon getRandomWeapon() {
        String[] nameArray = {"Fire Sword", "Ice Sword", "Power Sword", "Light Sword", "Long Sword"};
        int[] forceArray = {13, 12, 20, 14, 19};

        Random random = new Random();
        int num = random.nextInt(0, 5);
        return new Weapon(nameArray[num], forceArray[num]);

    }

}
