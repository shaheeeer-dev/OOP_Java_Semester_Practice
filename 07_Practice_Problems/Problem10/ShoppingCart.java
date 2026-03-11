package Problem10;

import java.util.ArrayList;

public class ShoppingCart<T> {

    private ArrayList<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public double calculateTotal() {

        double total = 0;

        for (T item : items) {

            if (item instanceof Item) {
                total += ((Item) item).getPrice();
            }

        }

        return total;
    }

    public void showItems() {
        for (T item : items) {
            if (item instanceof Item) {
            ((Item) item).displayItem();
            }
        }
    }
}