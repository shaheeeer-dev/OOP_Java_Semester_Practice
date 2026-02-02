package Swing_Basics;

import javax.swing.*;

class StudentForm {
    public StudentForm() {
        JFrame frame = new JFrame("Student Form");
        frame.setSize(300, 200);
        frame.setLayout(null);

        JTextField name = new JTextField();
        name.setBounds(100, 30, 150, 25);

        JTextField roll = new JTextField();
        roll.setBounds(100, 70, 150, 25);

        JButton submit = new JButton("Submit");
        submit.setBounds(100, 110, 80, 30);

        submit.addActionListener(e ->
                JOptionPane.showMessageDialog(
                        frame,
                        "Name: " + name.getText() +
                                "\nRoll: " + roll.getText()
                )
        );

        frame.add(new JLabel("Name:")).setBounds(20, 30, 80, 25);
        frame.add(new JLabel("Roll:")).setBounds(20, 70, 80, 25);
        frame.add(name);
        frame.add(roll);
        frame.add(submit);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

public class StudentFormTest {
    public static void main(String[] args) {
        new StudentForm();
    }
}