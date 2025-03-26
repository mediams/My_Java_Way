package battle;

public class SuperheroBattle {

    // Main logic of the battle game
    public static void main(String[] args) {
        Protection armour = new Protection("Armour", 4);
        Superhero spiderman = new Superhero("Spiderman", 10, Weapon.getRandomWeapon(), armour);
        Mag mag = new Mag("Angel", 5, 10, 20);

        EvilCreature evilCreature = new EvilCreature("Test", 5, 10, false);

        EvilCreature zombie = EvilCreature.generateRandomEvilCreature();

        spiderman.introduce();
        zombie.introduce();

        System.out.println();
        spiderman.fight(zombie); // method on the object call
        spiderman.fight(evilCreature); // method on the object call

        System.out.println();
        System.out.println("After fight:");
        System.out.println(spiderman);
        System.out.println(zombie);

        System.out.println(evilCreature);
        System.out.println(spiderman);
        mag.heal(spiderman);
        mag.increaseForce(spiderman);
        System.out.println(spiderman);

        mag.heal(spiderman, evilCreature);
        System.out.println(evilCreature);

    }


}
