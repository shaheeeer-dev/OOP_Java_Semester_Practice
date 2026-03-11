package Problem09;

public class Armor extends GameItem {
    private int defense;

    public Armor(String id, String name, int defense) {
        super(id, name);
        this.defense = defense;
    }

    @Override
    public void displayItem() {
        System.out.println("Armor: " + name + " | Defense: " + defense);
    }
}