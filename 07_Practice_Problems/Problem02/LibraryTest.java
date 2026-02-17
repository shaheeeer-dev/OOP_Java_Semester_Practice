package Problem02;

public class LibraryTest {
    public static void main(String[] args) {
        LibraryItem book = new Book("Java Programming", "Shaheer", 101);
        LibraryItem magazine = new Magazine("Tech Today", "Ali", 102);
        LibraryItem dvd = new DVD("Inception", "Christopher Nolan", 103);

        LibraryItem[] items = {book, magazine, dvd};

        int daysLate = 3;
        for (LibraryItem item : items) {
            System.out.println(item);
            System.out.println("Late Fee for " + daysLate + " days: $" + item.calculateLateFee(daysLate));
            System.out.println("-------------------------------------------------");
        }
    }
}