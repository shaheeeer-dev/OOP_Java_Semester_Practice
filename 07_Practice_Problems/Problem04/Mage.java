package Problem04;

public class Mage extends GameCharacter {
    public Mage(String name, int level, double health) {
        super(name, level, health);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " casts a powerful spell!");
    }
}