package Swing_Basics;

import javax.swing.*;

class LoginWindow {
    public LoginWindow() {
        JFrame frame = new JFrame("Login");
        frame.setSize(300, 200);
        frame.setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 30, 80, 25);

        JTextField userField = new JTextField();
        userField.setBounds(110, 30, 150, 25);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(20, 70, 80, 25);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(110, 70, 150, 25);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(100, 110, 80, 30);

        loginBtn.addActionListener(e ->
                System.out.println("Login button clicked")
        );

        frame.add(userLabel);
        frame.add(userField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(loginBtn);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

public class LoginWindowTest {
    public static void main(String[] args) {
        new LoginWindow();
    }
}