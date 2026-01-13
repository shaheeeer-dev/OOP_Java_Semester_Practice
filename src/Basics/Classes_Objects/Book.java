//Problem 4: Library Book Tracker

package Basics.Classes_Objects;

public class Book { //Book class
    //instance variables
    int bookId;
    String title;
    boolean isIssued;


    public void issueBook(){
        isIssued = true;
    }

    public void returnBook(){
        isIssued = false;
    }

    @Override
    public String toString() {  //toString method to display result
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", isIssued=" + isIssued +
                '}';
    }

    public static void main(String[] args) {
        //object creation
        Book b1 = new Book();
        Book b2 = new Book();

        //initializing objects
        b1.bookId = 100;
        b1.title = "Fundamentals of Java";
        b1.isIssued = true;

        b2.bookId = 101;
        b2.title = "Introduction to Programming";
        b2.isIssued = false;

        //method calls
        b1.issueBook();
        b2.returnBook();

        System.out.println(b1.toString());
        System.out.println(b2.toString());
    }
}
