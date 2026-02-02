package Swing_Basics;

import javax.swing.*;
import java.awt.*;

class ColorChanger {
    public ColorChanger() {
        JFrame frame = new JFrame("Color Changer");
        frame.setSize(300, 200);

        JPanel panel = new JPanel();

        JButton red = new JButton("Red");
        JButton blue = new JButton("Blue");

        red.addActionListener(e -> panel.setBackground(Color.RED));
        blue.addActionListener(e -> panel.setBackground(Color.BLUE));

        panel.add(red);
        panel.add(blue);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

public class ColorChangerTest {
    public static void main(String[] args) {
        new ColorChanger();
    }
}