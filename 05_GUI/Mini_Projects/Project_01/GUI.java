package Mini_Projects.Project_01;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.*;

public class GUI {
    private JFrame frame;
    StudentManager manager = new StudentManager();
    String[] columns = {"ID", "Name", "Department", "Semester", "CGPA"};

    public GUI() {
        initializeGUI();
    }

    void initializeGUI(){
        frame = new JFrame("Student Management System");
        frame.setSize(900, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Enter Student Details:");
        label.setBounds(20, 20, 150, 25);

        JLabel idLabel = new JLabel("Student ID");
        idLabel.setBounds(20, 70, 80, 25);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(20, 120, 80, 25);

        JLabel deptLabel = new JLabel("Department");
        deptLabel.setBounds(20, 170, 80, 25);

        JLabel semLabel = new JLabel("Semester");
        semLabel.setBounds(20, 220, 80, 25);

        JLabel cgpaLabel = new JLabel("CGPA");
        cgpaLabel.setBounds(20, 270, 80, 25);


        JTextField idField = new JTextField();
        idField.setBounds(120, 70, 180, 25);

        JTextField nameField = new JTextField();
        nameField.setBounds(120, 120, 180, 25);

        JTextField deptField = new JTextField();
        deptField.setBounds(120, 170, 180, 25);

        JTextField semField = new JTextField();
        semField.setBounds(120, 220, 180, 25);

        JTextField cgpaField = new JTextField();
        cgpaField.setBounds(120, 270, 180, 25);

        JButton searchBtn = new JButton("Search Student");
        searchBtn.setBounds(150, 340, 120, 35);

        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(350, 20, 530, 360);

        JButton addBtn = new JButton("Add Student");
        addBtn.setBounds(20, 340, 120, 35);
        addBtn.addActionListener(e -> {
            String id = idField.getText().trim();
            String name = nameField.getText().trim();
            String dept = deptField.getText().trim();

            if (!id.isEmpty() && !name.isEmpty() && !dept.isEmpty()) {
                try {
                    int sem = Integer.parseInt(semField.getText().trim());
                    double cgpa = Double.parseDouble(cgpaField.getText().trim());
                    Student s = new Student(id, name, dept, sem, cgpa);
                    manager.addStudent(s);
                    model.addRow(new Object[]{id, name, dept, sem, cgpa});

                    idField.setText("");
                    nameField.setText("");
                    deptField.setText("");
                    semField.setText("");
                    cgpaField.setText("");
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Enter valid numbers");
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Fill all fields");
            }
        });

        frame.add(label);
        frame.add(idLabel);
        frame.add(idField);
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(deptLabel);
        frame.add(deptField);
        frame.add(semLabel);
        frame.add(semField);
        frame.add(cgpaLabel);
        frame.add(cgpaField);
        frame.add(addBtn);
        frame.add(searchBtn);
        frame.add(scrollPane);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }
}
