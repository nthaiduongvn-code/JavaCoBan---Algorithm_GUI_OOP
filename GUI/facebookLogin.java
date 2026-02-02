package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class facebookLogin extends JFrame {
    public facebookLogin() {
        super("Facebook Login");
        setSize(400,370);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(12, 25, 25, 25));
        panel.setBackground(Color.WHITE);

        JTextField username = new JTextField(20);
        username.setMaximumSize(new Dimension(400, 60));
        username.setAlignmentX(Component.CENTER_ALIGNMENT);
        username.setFont(new Font("Arial", Font.BOLD, 16));
        username.setBorder(BorderFactory.createTitledBorder("Email hoặc số điện thoại"));

        JPasswordField password = new JPasswordField();
        password.setMaximumSize(new Dimension(400,60));
        password.setAlignmentX(Component.CENTER_ALIGNMENT);
        password.setFont(new Font("Arial", Font.BOLD, 16));
        password.setBorder(BorderFactory.createTitledBorder("mật khẩu"));

        JButton login = new JButton("Đăng nhập");
        login.setMaximumSize(new Dimension(400,50));
        login.setBackground(new Color(66,103,180));
        login.setForeground(Color.white);
        login.setFont(new Font("Arial", Font.BOLD, 17));
        login.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel forgetPassword = new JLabel("Quên mật khẩu?");
        forgetPassword.setForeground(new Color(66,103,180));
        forgetPassword.setFont(new Font("Arial", Font.PLAIN, 13));
        forgetPassword.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton newAccount = new JButton("Tạo tài khoản mới");
        newAccount.setFont(new Font("Arial", Font.BOLD, 13));
        newAccount.setMaximumSize(new Dimension(200,50));
        newAccount.setBackground(new Color(60,150,40));
        newAccount.setForeground(Color.white);
        newAccount.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(username);
        panel.add(Box.createVerticalStrut(12));
        panel.add(password);
        panel.add(Box.createVerticalStrut(12));
        panel.add(login);
        panel.add(Box.createVerticalStrut(16));
        panel.add(forgetPassword);
        panel.add(Box.createVerticalStrut(33));
        panel.add(newAccount);

        add(panel);

        login.addActionListener(e ->  {
            String usn = username.getText();
            String pw = new String((password.getPassword()));
            if(usn.equals("admin") && pw.equals("123")) {
                JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
            }
            else
                JOptionPane.showMessageDialog(this, "accout is wrong!");
        });

        newAccount.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, " Chưa thiết lập tính năng");
        });

    }
    public static void main(String[] args) {
        new facebookLogin().setVisible(true);
    }

}

