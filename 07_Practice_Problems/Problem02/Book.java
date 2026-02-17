package Problem02;

public class Book extends LibraryItem {
    public Book(String title, String author, int itemId) {
        super(title, author, itemId);
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 1.0;
    }
}
