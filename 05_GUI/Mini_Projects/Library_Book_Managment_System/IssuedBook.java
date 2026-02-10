package Mini_Projects.Library_Book_Managment_System;

public class IssuedBook extends Book {
    private String studentName;

    public IssuedBook(Book b,String student){
        super(b.id,b.title,b.author,b.price);
        this.studentName=student;
        this.available=false;
    }

    @Override
    public String displayInfo(){
        return super.displayInfo()+" | Issued To: "+studentName;
    }
}