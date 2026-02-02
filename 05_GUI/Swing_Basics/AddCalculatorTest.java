package Swing_Basics;

import javax.swing.*;

class AddCalculator {
    public AddCalculator() {
        JFrame frame = new JFrame("Add Calculator");
        frame.setSize(300, 200);
        frame.setLayout(null);

        JTextField t1 = new JTextField();
        t1.setBounds(30, 30, 100, 25);

        JTextField t2 = new JTextField();
        t2.setBounds(150, 30, 100, 25);

        JButton addBtn = new JButton("Add");
        addBtn.setBounds(90, 70, 80, 30);

        JLabel result = new JLabel("Result:");
        result.setBounds(30, 120, 200, 25);

        addBtn.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            result.setText("Result: " + (a + b));
        });

        frame.add(t1);
        frame.add(t2);
        frame.add(addBtn);
        frame.add(result);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

public class AddCalculatorTest {
    public static void main(String[] args) {
        new AddCalculator();
    }
}