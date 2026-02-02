package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI_Login extends JFrame {
    public GUI_Login() {
        setTitle("Mini Login");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20,30,20,30));
        panel.setBackground(Color.white);
        add(panel);

        JLabel username = new JLabel("Username: ");
        username.setFont(new Font("Arial", Font.BOLD, 14));

        JTextField usernameField = new JTextField(20);
        usernameField.setMaximumSize(new Dimension(100,20));


        JLabel password = new JLabel("Password: ");
        password.setFont(new Font("Arial", Font.BOLD, 14));

        JPasswordField passwordField = new JPasswordField(20);
        usernameField.setMaximumSize(new Dimension(100,20));

        JButton login = new JButton("Login");
        JButton clear = new JButton("Clear");

        panel.add(username);
        panel.add(usernameField);
        panel.add(password);
        panel.add(passwordField);
        panel.add(login);
        panel.add(clear);

        panel.setLayout(new GridLayout(3, 2, 5, 5));

        login.addActionListener(e -> {
            String user = usernameField.getText();
            String pass = new String(passwordField.getPassword());
            if (user.equals("admin") && pass.equals("123")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(this, "Wrong username or password");
            }
        });
        clear.addActionListener(e -> {
            usernameField.setText("");
            passwordField.setText("");
        });
    }

    public static void main(String[] args) {
        new GUI_Login().setVisible(true);
    }
}
