package a_oop.polymorphism_referenceTypes.battle;

public class Mag extends Character implements HealingSkills, ReinforcementSkills {
    private int force;
    private int protection;
    private int level;

    public Mag(String name, int force, int protection, int level) {
        super(name);
        this.force = force;
        this.protection = protection;
        this.level = level;
    }

    public Mag(String name) {
        super(name);
    }

    @Override
    public int countForce() {
        return force;
    }

    @Override
    public int countProtection() {
        return protection;
    }

    @Override
    public String toString() {
        return "Mag{" +
                "force=" + force +
                ", protection=" + protection +
                ", level=" + level +
                '}';
    }

    @Override
    public void heal(Character character) {
        int healthCaracter = character.getHealth();
        healthCaracter += 10;
        healthCaracter = healthCaracter > 100 ? 100 : healthCaracter;
        character.setHealth(healthCaracter);
    }

    @Override
    public void heal(Character... characters) {
        for (Character num : characters) {
            int healthCaracter = num.getHealth();
            healthCaracter += 10;
            healthCaracter = healthCaracter > 100 ? 100 : healthCaracter;
            num.setHealth(healthCaracter);
        }
    }

    @Override
    public void increaseForce(Superhero hero) {
        hero.setForce(hero.getForce() + (int) (this.force * 0.1 * level));
    }

    @Override
    public void increaseForce(Superhero... heroes) {
        for (Superhero num : heroes) {
            num.setForce(num.getForce() + (int) (this.force * 0.1 * level));
        }
    }
}
