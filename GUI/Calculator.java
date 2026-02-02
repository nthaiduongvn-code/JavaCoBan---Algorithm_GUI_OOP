package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    private JTextField tf;
    private String current = "";
    private double num1 = 0, num2 = 0;
    private String op = "";

    public Calculator() {
        super("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        tf = new JTextField();
        tf.setEditable(false);
        tf.setFont(new Font("Arial", Font.BOLD, 16));
        add(tf, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String b : buttons) {
            JButton btn = new JButton(b);
            btn.setFont(new Font("Arial", Font.BOLD, 20));
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if (s.matches("[0-9]")) {
            current += s;
            tf.setText(current);
        }
        else if (s.matches("[-+*/]")) {
            num1 = Double.parseDouble(current);
            op = s;
            current = "";
        }
        else if (s.equals("=")) {
            num2 = Double.parseDouble(current);
            double result = 0;

            switch (op) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num1 / num2; break;
            }

            tf.setText(String.valueOf(result));
            current = String.valueOf(result);
        }
        else if (s.equals("C")) {
            current = "";
            tf.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator().setVisible(true);
    }
}

