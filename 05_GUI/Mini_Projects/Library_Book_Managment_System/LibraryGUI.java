package Mini_Projects.Library_Book_Managment_System;

import javax.swing.*;
import java.awt.*;

public class LibraryGUI {
    private Library library = new Library();
    private JTextArea output = new JTextArea();

    public LibraryGUI() {
        JFrame frame = new JFrame("Library System");
        frame.setSize(700,500);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4,2,5,5));
        panel.setBorder(BorderFactory.createTitledBorder("Book Details"));

        JTextField id = new JTextField();
        JTextField title = new JTextField();
        JTextField author = new JTextField();
        JTextField price = new JTextField();

        panel.add(new JLabel("Book ID"));
        panel.add(id);
        panel.add(new JLabel("Title"));
        panel.add(title);
        panel.add(new JLabel("Author"));
        panel.add(author);
        panel.add(new JLabel("Price"));
        panel.add(price);

        JPanel buttons = new JPanel();

        JButton add = new JButton("Add Book");
        JButton issue = new JButton("Issue Book");
        JButton ret = new JButton("Return Book");
        JButton show = new JButton("Show Books");
        JButton sortTitle = new JButton("Sort by Title");
        JButton sortPrice = new JButton("Sort by Price");

        buttons.add(add);
        buttons.add(issue);
        buttons.add(ret);
        buttons.add(show);
        buttons.add(sortTitle);
        buttons.add(sortPrice);

        frame.add(panel,BorderLayout.NORTH);
        frame.add(new JScrollPane(output),BorderLayout.CENTER);
        frame.add(buttons,BorderLayout.SOUTH);

        add.addActionListener(e->{
            library.addBook(new Book(
                    id.getText(),
                    title.getText(),
                    author.getText(),
                    Double.parseDouble(price.getText())
            ));
        });

        issue.addActionListener(e->{
            String student = JOptionPane.showInputDialog(frame,"Student Name");
            library.issueBook(id.getText(),student);
        });

        ret.addActionListener(e->{
            library.returnBook(id.getText());
        });

        show.addActionListener(e->displayBooks());

        sortTitle.addActionListener(e->{library.sortByTitle();displayBooks();});
        sortPrice.addActionListener(e->{library.sortByPrice();displayBooks();});

        frame.setVisible(true);
    }

    private void displayBooks(){
        StringBuilder sb = new StringBuilder();
        for(Book b: library.getBooks()){
            sb.append(b.displayInfo()).append("\n");
        }
        output.setText(sb.toString());
    }

    public static void main(String[] args){
        new LibraryGUI();
    }
}