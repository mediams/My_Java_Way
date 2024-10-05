package summary20240927.battle;

import java.util.Random;

public final class EvilCreature extends Character {

    private int force;
    private int protection;

    boolean isAngry;

    public EvilCreature(String name, int force, int protection, boolean isAngry) {
        super(name);
        this.force = force;
        this.protection = protection;
        this.isAngry = isAngry;
    }

    public EvilCreature(String name) {
        super(name);
    }

    @Override
    public int countForce() {
        if (isAngry) {
            return force * 2;
        }
        return force;
    }

    @Override
    public int countProtection() {
        return protection;
    }

    @Override
    public String toString() {
        return "EvilCreature='" + getName() + '\'' +
                ", health=" + getHealth() +
                ", force=" + force + "(" + countForce() + ")" +
                ", protection=" + protection +
                ", isAngry = " + isAngry;
    }

    public static EvilCreature generateRandomEvilCreature() {
        String[] nameArray = {"Dark Lord", "Big Boss", "Killer", "Dark Vader", "Death Man"};
        int[] forceArray = {3, 2, 10, 4, 9};
        int[] protectionArray = {1, 2, 6, 7, 3};


        Random random = new Random();
        int num = random.nextInt(0, 5);
        return new EvilCreature(nameArray[num], forceArray[num], protectionArray[num], true);

    }


//    @Override
//    public void fight(Character another) {
//        System.out.println("Custom logic for evil creature");
//    }
}
