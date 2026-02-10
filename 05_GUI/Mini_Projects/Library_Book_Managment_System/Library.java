package Mini_Projects.Library_Book_Managment_System;

import java.util.*;

public class Library {
    private ArrayList<Book> books=new ArrayList<>();

    public void addBook(Book b){
        books.add(b);
    }

    public void issueBook(String id,String student){
        for(int i=0;i<books.size();i++){
            Book b=books.get(i);
            if(b.getId().equals(id)&&b.isAvailable()){
                books.set(i,new IssuedBook(b,student));
                return;
            }
        }
    }

    public void returnBook(String id){
        for(int i=0;i<books.size();i++){
            Book b=books.get(i);
            if(b.getId().equals(id)&&!b.isAvailable()){
                Book newBook=new Book(b.id,b.title,b.author,b.price);
                books.set(i,newBook);
                return;
            }
        }
    }

    public ArrayList<Book> getBooks(){
        return books;
    }

    public void sortByTitle(){
        Collections.sort(books);
    }

    public void sortByPrice(){
        books.sort((a,b)->Double.compare(a.price,b.price));
    }
}