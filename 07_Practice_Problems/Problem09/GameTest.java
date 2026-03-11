package Problem09;

public class GameTest {
    public static void main(String[] args) {

        Inventory<GameItem> inventory = new Inventory<>();

        Weapon sword = new Weapon("W01", "Dragon Sword", 50);
        Potion potion = new Potion("P01", "Health Potion", 30);
        Armor armor = new Armor("A01", "Steel Armor", 40);

        inventory.addItem(sword);
        inventory.addItem(potion);
        inventory.addItem(armor);

        System.out.println("Player Inventory:");
        inventory.showItems();
    }
}