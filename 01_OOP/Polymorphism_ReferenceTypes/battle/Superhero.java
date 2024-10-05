package battle;

public class Superhero extends Character {

    private int force;
    private Weapon weapon;
    private Protection protection;


    public Superhero(String name, int force, Weapon weapon, Protection protection) {
        super(name);
        this.force = force;
        this.weapon = weapon;
        this.protection = protection;
    }

    @Override
    public int countForce() {
        return force + weapon.getForce();
    }

    @Override
    public int countProtection() {
        return protection.getLevel();
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public Protection getProtection() {
        return protection;
    }

    public void setProtection(Protection protection) {
        this.protection = protection;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Hero='" + getName() + '\'' +
                ", health=" + getHealth() +
                ", force=" + force +
                ", protection=" + protection +
                ", weapon=" + weapon;
    }

}
