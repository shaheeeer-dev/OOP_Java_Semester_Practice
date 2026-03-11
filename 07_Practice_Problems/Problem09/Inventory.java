package Problem09;

import java.util.ArrayList;

public class Inventory<T> {
    private ArrayList<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void showItems() {
        for (T item : items) {
            if (item instanceof GameItem) {
                ((GameItem) item).displayItem();
            } else {
                System.out.println(item);
            }

        }
    }
}