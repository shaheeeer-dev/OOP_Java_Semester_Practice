package Problem04;

public class GameTest {
    public static void main(String[] args) {
        GameCharacter warrior = new Warrior("Thor", 10, 100);
        GameCharacter mage = new Mage("Merlin", 12, 80);
        GameCharacter archer = new Archer("Legolas", 8, 90);

        GameCharacter[] characters = {warrior, mage, archer};

        System.out.println("Character Attacks");
        for (GameCharacter character : characters) {
            character.attack();
        }

        Inventory<String> warriorInventory = new Inventory<>();
        warriorInventory.addItem("Sword");
        warriorInventory.addItem("Shield");

        Inventory<String> mageInventory = new Inventory<>();
        mageInventory.addItem("Spellbook");
        mageInventory.addItem("Magic Wand");

        Inventory<String> archerInventory = new Inventory<>();
        archerInventory.addItem("Bow");
        archerInventory.addItem("Quiver");

        System.out.println("\nInventories");
        System.out.print("Warrior: "); warriorInventory.showItems();
        System.out.print("Mage: "); mageInventory.showItems();
        System.out.print("Archer: "); archerInventory.showItems();
    }
}