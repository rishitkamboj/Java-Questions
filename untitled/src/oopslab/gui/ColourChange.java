package oopslab.gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColourChange implements ActionListener {
    JFrame f1;
    JButton r;
    JButton g;
    JButton b;

    ColourChange(){
        f1 = new JFrame("Colour Change");
        r = new JButton("RED");
        g = new JButton("GREEN");
        b = new JButton("BLUE");

        r.addActionListener(this);
        g.addActionListener(this);
        b.addActionListener(this);

        f1.setLayout(null);

        f1.add(r);
        f1.add(g);
        f1.add(b);


        r.setBounds(50, 50, 100, 30);
        g.setBounds(50, 100, 100, 30);
        b.setBounds(50, 150, 100, 30);

        f1.setSize(200, 250);
        f1.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == r) {
            f1.getContentPane().setBackground(Color.RED);
        } else if (e.getSource() == g) {
            f1.getContentPane().setBackground(Color.GREEN);
        } else if (e.getSource() == b) {
            f1.getContentPane().setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        ColourChange colourChange = new ColourChange();
    }
}
