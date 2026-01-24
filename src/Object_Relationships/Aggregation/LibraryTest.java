//Problem 2: Library & Book

package Object_Relationships.Aggregation;

import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    Book(String t, String a) {
        title = t;
        author = a;
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
}

class Library {
    private String name;
    ArrayList<Book> books;

    Library(String name, ArrayList<Book> books) {
        this.name = name;
        this.books = books;
    }

    void showBooks() {
        System.out.println("Library: " + name);
        for (Book b : books)
            System.out.println(b.getTitle() + " by " + b.getAuthor());
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        Book b1 = new Book("Java", "Herbert");
        Book b2 = new Book("OOP", "Shaheer");

        ArrayList<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);

        Library lib = new Library("City Library", books);
        lib.showBooks();
    }
}
