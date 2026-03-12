package Problem12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.time.LocalTime;

public class TypingSpeedGUI {
    private JFrame frame;
    private JTextArea textShow;
    private JTextArea userInput;
    private JButton checkButton;
    private long startTime;
    String[] sentences = {
            "The quick brown fox jumps over the lazy dog.",
            "Pack my box with five dozen liquor jugs.",
            "Jackdaws love my big sphinx of quartz.",
            "The five boxing wizards jump quickly.",
            "Waltz, nymph, for quick jigs vex Bud."
    };

    public TypingSpeedGUI() {
        frame = new JFrame("Typing Speed Test");
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        Random random = new Random();
        String sentence = sentences[random.nextInt(sentences.length)];

        textShow = new JTextArea(sentence);
        textShow.setEditable(false);
        textShow.setLineWrap(true);
        textShow.setFont(new Font("Arial",Font.BOLD,16));

        userInput = new JTextArea();
        userInput.setLineWrap(true);
        userInput.setFont(new Font("Arial",Font.PLAIN,16));

        checkButton = new JButton("Check Speed");

        frame.add(new JScrollPane(textShow), BorderLayout.NORTH);
        frame.add(new JScrollPane(userInput), BorderLayout.CENTER);
        frame.add(checkButton, BorderLayout.SOUTH);

        startTime = System.currentTimeMillis();

        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                long endTime = System.currentTimeMillis();
                long timeTaken = (endTime - startTime) / 1000;

                String typed = userInput.getText();
                int words = typed.split(" ").length;

                double wpm = (words / (double) timeTaken) * 60;

                if (userInput.getText().equals(textShow.getText())) {
                    JOptionPane.showMessageDialog(frame,"WellDone!\nTyping Speed: " + (int)wpm + " WPM");
                    resetTest();

                }else {
                    JOptionPane.showMessageDialog(frame,"There are mistakes in your typing!");
                }
            }
        });

        frame.setVisible(true);
    }

    public void resetTest(){
        Random random = new Random();
        textShow.setText(sentences[random.nextInt(sentences.length)]);
        userInput.setText("");
        startTime = System.currentTimeMillis();

        startTime = System.currentTimeMillis();
    }

    public static void main(String[] args) {
        new TypingSpeedGUI();
    }
}