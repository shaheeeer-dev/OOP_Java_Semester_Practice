package Mini_Projects.ATM_Simulator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ATMFrame extends JFrame {
    private JTextField accNoField, nameField, amountField;
    private JTextArea outputArea;
    private Account currentAccount;

    public ATMFrame() {
        setTitle("ATM Simulator");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(4,2,5,5));

        inputPanel.add(new JLabel("Account No:"));
        accNoField = new JTextField();
        inputPanel.add(accNoField);

        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Amount:"));
        amountField = new JTextField();
        inputPanel.add(amountField);

        add(inputPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(2,3,5,5));

        JButton createBtn = new JButton("Create Account");
        JButton depositBtn = new JButton("Deposit");
        JButton withdrawBtn = new JButton("Withdraw");
        JButton balanceBtn = new JButton("Check Balance");
        JButton historyBtn = new JButton("History");

        buttonPanel.add(createBtn);
        buttonPanel.add(depositBtn);
        buttonPanel.add(withdrawBtn);
        buttonPanel.add(balanceBtn);
        buttonPanel.add(historyBtn);

        add(buttonPanel, BorderLayout.CENTER);

        outputArea = new JTextArea();
        add(new JScrollPane(outputArea), BorderLayout.SOUTH);

        createBtn.addActionListener(e -> createAccount());

        depositBtn.addActionListener(e -> {
            if(currentAccount == null) return;
            double amount = Double.parseDouble(amountField.getText());
            currentAccount.deposit(amount);
            outputArea.setText("Deposit Successful");
        });

        withdrawBtn.addActionListener(e -> {
            if(currentAccount == null) return;
            try {
                double amount = Double.parseDouble(amountField.getText());
                currentAccount.withdraw(amount);
                outputArea.setText("Withdraw Successful");
            } catch(Exception ex){
                outputArea.setText(ex.getMessage());
            }
        });

        balanceBtn.addActionListener(e -> {
            if(currentAccount == null) return;
            outputArea.setText("Balance: " + currentAccount.checkBalance());
        });

        historyBtn.addActionListener(e -> showHistory());

        setVisible(true);
    }

    private void createAccount() {
        String accNo = accNoField.getText();
        String name = nameField.getText();

        currentAccount = new SavingsAccount(accNo, name, 1000);
        outputArea.setText("Account Created Successfully");
    }

    private void showHistory() {

        if (currentAccount == null) return;

        StringBuilder sb = new StringBuilder();

        for (Transaction t : currentAccount.getTransactions()) {
            sb.append(t.toString()).append("\n");
        }

        outputArea.setText(sb.toString());
    }
    public static void main(String[] args) {
        new ATMFrame();
    }
}