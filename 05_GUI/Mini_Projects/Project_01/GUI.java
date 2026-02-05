package Mini_Projects.Project_01;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class GUI {
    private JFrame frame;
    private StudentManager manager = new StudentManager();
    private String[] columns = {"ID", "Name", "Department", "Semester", "CGPA"};

    public GUI() {
        initializeGUI();
    }

    void initializeGUI() {
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

        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(350, 20, 530, 370);

        JButton addBtn = new JButton("Add Student");
        addBtn.setBounds(20, 320, 120, 35);
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
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Enter valid numbers");
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Fill all fields");
            }
        });

        JButton searchBtn = new JButton("Search Student");
        searchBtn.setBounds(150, 320, 120, 35);
        searchBtn.addActionListener(e -> {
            String id = idField.getText().trim();
            String name = nameField.getText().trim();

            model.setRowCount(0);
            if (!id.isEmpty()) {
                Student s = manager.searchById(id);
                if (s != null)
                    model.addRow(new Object[]{s.getId(), s.getName(), s.getDepartment(), s.getSemester(), s.getCGPA()});
                else JOptionPane.showMessageDialog(frame, "Student not found");
            } else if (!name.isEmpty()) {
                ArrayList<Student> list = manager.searchByName(name);
                if (!list.isEmpty()) {
                    for (Student s : list)
                        model.addRow(new Object[]{s.getId(), s.getName(), s.getDepartment(), s.getSemester(), s.getCGPA()});
                } else JOptionPane.showMessageDialog(frame, "Student not found");
            } else {
                JOptionPane.showMessageDialog(frame, "Enter ID or Name to search");
            }
        });

        JButton deleteBtn = new JButton("Delete Student");
        deleteBtn.setBounds(20, 360, 120, 35);
        deleteBtn.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow >= 0) {
                String id = (String) model.getValueAt(selectedRow, 0);
                Student s = manager.searchById(id);
                if (s != null) {
                    manager.deleteStudent(s);
                    model.removeRow(selectedRow);
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Select a student to delete");
            }
        });

        JButton updateBtn = new JButton("Update Student");
        updateBtn.setBounds(150, 360, 130, 35);
        updateBtn.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow >= 0) {
                try {
                    String id = (String) model.getValueAt(selectedRow, 0);
                    Student s = manager.searchById(id);
                    if (s != null) {
                        s.setName(nameField.getText().trim());
                        s.setDepartment(deptField.getText().trim());
                        s.setSemester(Integer.parseInt(semField.getText().trim()));
                        s.setCGPA(Double.parseDouble(cgpaField.getText().trim()));

                        model.setValueAt(s.getName(), selectedRow, 1);
                        model.setValueAt(s.getDepartment(), selectedRow, 2);
                        model.setValueAt(s.getSemester(), selectedRow, 3);
                        model.setValueAt(s.getCGPA(), selectedRow, 4);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Enter valid values for update");
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Select a student to update");
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
        frame.add(deleteBtn);
        frame.add(updateBtn);
        frame.add(scrollPane);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }
}