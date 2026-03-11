package Problem09;

public class Weapon extends GameItem {
    private int damage;

    public Weapon(String id, String name, int damage) {
        super(id, name);
        this.damage = damage;
    }

    @Override
    public void displayItem() {
        System.out.println("Weapon: " + name + " | Damage: " + damage);
    }
}