package Swing_Basics;

import javax.swing.*;

class CounterApp {
    private int count = 0;

    public CounterApp() {
        JFrame frame = new JFrame("Counter");
        frame.setSize(250, 150);
        frame.setLayout(null);

        JLabel countLabel = new JLabel("Count: 0");
        countLabel.setBounds(80, 20, 100, 30);

        JButton btn = new JButton("Increment");
        btn.setBounds(60, 60, 120, 30);

        btn.addActionListener(e -> {
            count++;
            countLabel.setText("Count: " + count);
        });

        frame.add(countLabel);
        frame.add(btn);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

public class CounterAppTest {
    public static void main(String[] args) {
        new CounterApp();
    }
}