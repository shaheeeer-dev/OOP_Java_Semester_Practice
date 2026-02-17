package Problem02;

abstract class LibraryItem {
    private String title;
    private String author;
    private int itemId;

    public LibraryItem(String title, String author, int itemId) {
        this.title = title;
        this.author = author;
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    abstract double calculateLateFee(int daysLate);

    @Override
    public String toString() {
        return "LibraryItem{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", itemId=" + itemId +
                '}';
    }
}
