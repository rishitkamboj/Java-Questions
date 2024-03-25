package oopslab.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    JFrame f;
    JLabel p1;
    JLabel p2;
    JTextField a1;
    JTextField a2;
    JTextField a3;
    JButton add;
    JButton sub;
    JButton clear;

    Calculator() {
        f = new JFrame("Calculator");
        sub = new JButton("SUB");
        p1 = new JLabel("Input 1");
        p2 = new JLabel("Input 2");
        a1 = new JTextField();
        a2 = new JTextField();
        add = new JButton("ADD");
        clear = new JButton("CLEAR");
        a3 = new JTextField();

        f.setLayout(null);

        p1.setBounds(50, 50, 60, 20);
        a1.setBounds(150, 50, 120, 20);
        p2.setBounds(50, 80, 60, 20);
        a2.setBounds(150, 80, 120, 20);
        add.setBounds(50, 120, 100, 30);
        sub.setBounds(160, 120, 100, 30);
        clear.setBounds(270, 120, 100, 30);
        a3.setBounds(150, 160, 120, 20);


        add.addActionListener(this);
        sub.addActionListener(this);
        clear.addActionListener(this);

        f.add(sub);
        f.add(add);
        f.add(clear);
        f.add(p1);
        f.add(p2);
        f.add(a1);
        f.add(a2);
        f.add(a3);

        f.setSize(450, 250);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            double num1 = Double.parseDouble(a1.getText());
            double num2 = Double.parseDouble(a2.getText());
            double result = num1 + num2;
            a3.setText(Double.toString(result));
        } else if (e.getSource() == sub) {
            double num1 = Double.parseDouble(a1.getText());
            double num2 = Double.parseDouble(a2.getText());
            double result = num1 - num2;
            a3.setText(Double.toString(result));
        } else if (e.getSource() == clear) {
            a1.setText("");
            a2.setText("");
            a3.setText("");
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
    }
}
