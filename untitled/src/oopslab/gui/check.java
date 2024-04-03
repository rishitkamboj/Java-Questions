package oopslab.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class check  {
    JFrame f;
  JComboBox c1;

    check(){
        f=new JFrame("CHECK");
                f.setVisible(true);
        f.setLayout(null);
        f.setSize(500,500);

   String country[]={"ABC","PAKISTAN"};
        c1=new JComboBox(country);
        f.add(c1);
        c1.setBounds(100,100,100,100);


    }

    public static void main(String[] args) {
        check a =new check();
    }
}
