package Problem02;

public class DVD extends LibraryItem {
    public DVD(String title, String author, int itemId) {
        super(title, author, itemId);
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 2.0;
    }
}