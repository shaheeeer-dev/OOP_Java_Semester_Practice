package Problem09;

public abstract class GameItem {
    protected String itemId;
    protected String name;

    public GameItem(String itemId, String name) {
        this.itemId = itemId;
        this.name = name;
    }

    public String getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public abstract void displayItem();
}