package oopslab.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fact implements ActionListener {
    JFrame f;
    JLabel l;
    JLabel factorial;
    JTextField factor;

    JLabel square;
    JTextField square2;
    JButton b;
    JTextField tf;

    fact() {
        f = new JFrame();
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500, 300);
        l = new JLabel("Enter a number: ");
        tf = new JTextField();
        factorial = new JLabel("Factorial: ");
        factor = new JTextField();
        square = new JLabel("Square: ");
        square2 = new JTextField();
        b = new JButton("Calculate");
        b.addActionListener(this);
        l.setBounds(50, 50, 100, 30);
        tf.setBounds(160, 50, 100, 30);
        b.setBounds(50, 90, 100, 30);
        square.setBounds(50, 130, 100, 30);
        square2.setBounds(160, 130, 100, 30);
        factorial.setBounds(50, 170, 100, 30);
        factor.setBounds(160, 170, 100, 30);
        f.add(l);
        f.add(tf);
        f.add(b);
        f.add(square);
        f.add(square2);
        f.add(factor);
        f.add(factorial);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(tf.getText());
        int fact = 1;
        int square = a * a;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        square2.setText(Integer.toString(square));
        factor.setText(Integer.toString(fact));
    }

    public static void main(String[] args) {
        fact a = new fact();
    }
}
