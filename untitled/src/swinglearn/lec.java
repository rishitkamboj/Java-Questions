package swinglearn;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lec implements ActionListener {
    JFrame f;
    JButton but;
    JLabel a;
    JLabel b;
    JLabel c;
    JTextField a1;
    JTextField a2;
    JTextField a3;

    lec() {
        f = new JFrame("ADD Program");
        but = new JButton("ADD");
        a = new JLabel("Num 1");
        b = new JLabel("Num 2");
        c = new JLabel("Result: ");
        a1 = new JTextField();
        a2 = new JTextField();
        a3 = new JTextField();

        f.add(but);
        f.add(a);
        f.add(b);
        f.add(a1);
        f.add(a2);
        f.add(a3);
        f.add(c);
        f.setVisible(true);
        a.setBounds(10, 10, 50, 20);
        a1.setBounds(60, 10, 50, 30);
        b.setBounds(140, 10, 50, 20);
        a2.setBounds(200, 10, 50, 30);
        but.setBounds(260, 10, 70, 20);
        c.setBounds(10, 60, 50, 30);
        a3.setBounds(70, 60, 50, 20);
        f.setLayout(null);
        but.addActionListener(this);

        f.setSize(500, 500);
    }

    public void actionPerformed(ActionEvent e) {
        int sum = Integer.parseInt(a1.getText()) + Integer.parseInt(a2.getText());
        a3.setText(Integer.toString(sum));
    }


    public static void main(String[] args) {
        lec a = new lec();
    }

}

