package Problem10;

public class CartTest {
    public static void main(String[] args) {
        ShoppingCart<Item> cart = new ShoppingCart<>();
        Item item1 = new Item("Laptop", 1200);
        Item item2 = new Item("Headphones", 150);
        Item item3 = new Item("Mouse", 40);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        System.out.println("Shopping Cart Items:");
        cart.showItems();
        System.out.println("-----------------");

        double total = cart.calculateTotal();
        System.out.println("Total Price: $" + total);
    }
}