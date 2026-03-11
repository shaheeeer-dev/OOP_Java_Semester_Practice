package Problem09;

public class Potion extends GameItem {
    private int healingPower;

    public Potion(String id, String name, int healingPower) {
        super(id, name);
        this.healingPower = healingPower;
    }

    @Override
    public void displayItem() {
        System.out.println("Potion: " + name + " | Heal: " + healingPower);
    }
}