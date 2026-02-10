package Mini_Projects.Library_Book_Managment_System;

public class Book implements Comparable<Book> {
    protected String id;
    protected String title;
    protected String author;
    protected double price;
    protected boolean available;

    public Book(String id,String title,String author,double price){
        this.id=id;
        this.title=title;
        this.author=author;
        this.price=price;
        this.available=true;
    }

    public String getId(){return id;}
    public String getTitle(){return title;}
    public boolean isAvailable(){return available;}
    public void setAvailable(boolean val){available=val;}

    public String displayInfo(){
        return id+" | "+title+" | "+author+" | "+price+" | "+(available?"Available":"Issued");
    }

    @Override
    public int compareTo(Book o){
        return this.title.compareToIgnoreCase(o.title);
    }
}