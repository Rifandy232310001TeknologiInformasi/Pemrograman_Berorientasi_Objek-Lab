import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Latihan_02 extends JFrame implements ActionListener {
    
    private JTextField emailField, fullNameField, phoneField;
    private JPasswordField passwordField;
    private JButton loginButton, registerButton, submitButton;
    
    
    private JTextField npmField, nameField;
    private JRadioButton gradeA, gradeB, gradeC, gradeD, gradeE, gradeF;
    private JButton saveButton, deleteButton, clearButton;
    private JTable table;
    private JMenuItem newMenuItem, saveMenuItem, exitMenuItem;
    private JPanel mainPanel;

    public Latihan_02() {
        
        JPanel loginPanel = new JPanel();
        emailField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");
        registerButton = new JButton("Register");

        loginPanel.add(new JLabel("Email:"));
        loginPanel.add(emailField);
        loginPanel.add(new JLabel("Password:"));
        loginPanel.add(passwordField);
        loginPanel.add(loginButton);
        loginPanel.add(registerButton);

        loginButton.addActionListener(this);
        registerButton.addActionListener(this);

        add(loginPanel, BorderLayout.CENTER);

        setTitle("PBO Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            if (authenticateUser(email, password)) {
                JOptionPane.showMessageDialog(this, "Selamat datang Asisten Dosen PBO");
                displayMainForm();
            } else {
                JOptionPane.showMessageDialog(this, "Login failed");
            }
        } else if (e.getSource() == registerButton) {
            displayRegisterForm();
        } else if (e.getSource() == submitButton) {
            
            String fullName = fullNameField.getText();
            String email = emailField.getText();
            String phone = phoneField.getText();
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan:\n" + "Fullname: " + fullName + "\nEmail: " + email + "\nPhone: " + phone);
        }
    }

    private boolean authenticateUser(String email, String password) {
        
        return "asdos.pbo@ibk.ac.id".equals(email) && "password".equals(password);
    }

    private void displayMainForm() {
        
        getContentPane().removeAll();
        
        
        mainPanel = new JPanel(new BorderLayout());
        npmField = new JTextField(15);
        nameField = new JTextField(15);
        gradeA = new JRadioButton("A");
        gradeB = new JRadioButton("B");
        gradeC = new JRadioButton("C");
        gradeD = new JRadioButton("D");
        gradeE = new JRadioButton("E");
        gradeF = new JRadioButton("F");
        saveButton = new JButton("Save");
        deleteButton = new JButton("Delete");
        clearButton = new JButton("Clear");

        
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("NPM:"));
        inputPanel.add(npmField);
        inputPanel.add(new JLabel("Nama:"));
        inputPanel.add(nameField);

        JPanel gradePanel = new JPanel();
        gradePanel.add(gradeA);
        gradePanel.add(gradeB);
        gradePanel.add(gradeC);
        gradePanel.add(gradeD);
        gradePanel.add(gradeE);
        gradePanel.add(gradeF);

        inputPanel.add(new JLabel("Nilai:"));
        inputPanel.add(gradePanel);
        inputPanel.add(saveButton);
        inputPanel.add(deleteButton);
        inputPanel.add(clearButton);

        
        mainPanel.add(inputPanel, BorderLayout.NORTH);

        
        String[] columns = {"NPM", "Nama", "Nilai"};
        Object[][] data = {
            {"212310018", "SAKURA MIKO", "B"},
            {"212310019", "HOSHIMASHI SUISEI", "C"},
            {"212310020", "AKI ROSENTHAL", "A"}
        };

        table = new JTable(data, columns);
        JScrollPane scrollPane = new JScrollPane(table);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        
        add(mainPanel, BorderLayout.CENTER);

        
        revalidate();
        repaint();
    }

    private void displayRegisterForm() {
        
        JDialog registerDialog = new JDialog(this, "Register", true);
        registerDialog.setSize(300, 300);

        JPanel registerPanel = new JPanel();
        fullNameField = new JTextField(20);
        emailField = new JTextField(20);
        phoneField = new JTextField(20);
        submitButton = new JButton("Submit");

        registerPanel.add(new JLabel("Fullname:"));
        registerPanel.add(fullNameField);
        registerPanel.add(new JLabel("Email:"));
        registerPanel.add(emailField);
        registerPanel.add(new JLabel("Phone:"));
        registerPanel.add(phoneField);
        registerPanel.add(submitButton);

        submitButton.addActionListener(this);

        registerDialog.add(registerPanel);
        registerDialog.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Latihan_02().setVisible(true);
        });
    }
}
