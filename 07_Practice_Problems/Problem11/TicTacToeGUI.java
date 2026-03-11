package Problem11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToeGUI implements ActionListener{
    private JFrame frame;
    private JButton[][] buttons = new JButton[3][3];
    boolean playerX = true;

    public TicTacToeGUI() {
        initializeGUI();
    }

    public void initializeGUI(){
        frame = new JFrame();
        frame.setTitle("New Game");
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel titlePanel = new JPanel();
        JLabel title = new JLabel("Tic Tac Toe");
        title.setFont(new Font("Times New Roman", Font.BOLD, 30));
        titlePanel.add(title);

        JPanel grid = new JPanel();
        grid.setLayout(new GridLayout(3,3));
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(new Font("Arial", Font.BOLD, 35));
                buttons[i][j].addActionListener(this);
                grid.add(buttons[i][j]);
            }
        }

        JButton newGame = getJButton();

        frame.add(titlePanel, BorderLayout.NORTH);
        frame.add(grid, BorderLayout.CENTER);
        frame.add(newGame, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private JButton getJButton() {
        JButton newGame = new JButton("Restart Game");
        newGame.setForeground(Color.BLACK);
        newGame.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                newGame.setForeground(Color.RED);
            }

            public void mouseExited(MouseEvent e) {
                newGame.setForeground(Color.BLACK);
            }

            public void mouseClicked(MouseEvent e) {
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        buttons[i][j].setText("");
                    }
                }
                playerX = true;
            }
        });
        return newGame;
    }

    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton)e.getSource();
        if(!clicked.getText().equals("")) {
            return;
        }
        if(playerX){
            clicked.setText("X");
        }
        else{
            clicked.setText("O");
        }
        playerX = !playerX;
        checkWinner();
    }

    public void checkWinner(){
        String winner = "";

        for(int i=0;i<3;i++){

            if(!buttons[i][0].getText().equals("") &&
                    buttons[i][0].getText().equals(buttons[i][1].getText()) &&
                    buttons[i][1].getText().equals(buttons[i][2].getText())){

                winner = buttons[i][0].getText();
            }

            if(!buttons[0][i].getText().equals("") &&
                    buttons[0][i].getText().equals(buttons[1][i].getText()) &&
                    buttons[1][i].getText().equals(buttons[2][i].getText())){

                winner = buttons[0][i].getText();
            }
        }

        if(!buttons[0][0].getText().equals("") &&
                buttons[0][0].getText().equals(buttons[1][1].getText()) &&
                buttons[1][1].getText().equals(buttons[2][2].getText())){

            winner = buttons[0][0].getText();
        }

        if(!buttons[0][2].getText().equals("") &&
                buttons[0][2].getText().equals(buttons[1][1].getText()) &&
                buttons[1][1].getText().equals(buttons[2][0].getText())){

            winner = buttons[0][2].getText();
        }

        if(!winner.equals("")){
            JOptionPane.showMessageDialog(frame,"Player " + winner + " Wins!");
            resetBoard();
        }
    }

    public void resetBoard(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                buttons[i][j].setText("");
            }
        }
        playerX = true;
    }

    public static void main(String[] args) {
        new TicTacToeGUI();
    }
}
