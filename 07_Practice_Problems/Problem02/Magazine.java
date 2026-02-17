package Problem02;

public class Magazine extends LibraryItem {
    public Magazine(String title, String author, int itemId) {
        super(title, author, itemId);
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 0.5;
    }
}
