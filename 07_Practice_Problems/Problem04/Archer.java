package Problem04;

public class Archer extends GameCharacter {
    public Archer(String name, int level, double health) {
        super(name, level, health);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " shoots a precise arrow!");
    }
}