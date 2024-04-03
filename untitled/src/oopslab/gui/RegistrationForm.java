package oopslab.gui;

import javax.swing.*;

public class RegistrationForm {
    JFrame f1;
    JLabel head;
    JLabel fn;
    JLabel ln;
    JLabel num;
    JLabel email;
    JTextField fnt;
    JTextField lnt;
    JTextField numt;
    JTextField emt;
    JLabel gender;
    JRadioButton m;
    JRadioButton f;
    JLabel hob;
    JCheckBox p;
    JCheckBox C;
    JCheckBox S;
    JButton sub;
    JButton r;

    RegistrationForm(){
        f1=new JFrame("FaceBook Form");
        head=new JLabel("Facebook Registration Form");
        fn=new JLabel("First Name");
        ln=new JLabel("Last Name");
        fnt=new JTextField();
        lnt=new JTextField();
        email=new JLabel("Email");
        emt=new JTextField();
        num=new JLabel("Mobile Number");
        numt=new JTextField();
        gender=new JLabel("Gender");
        m=new JRadioButton("M");
        f=new JRadioButton("F");
        hob=new JLabel("Select Hobbies");
        p=new JCheckBox("Playing Cricket");
        C=new JCheckBox("Cooking");
        S=new JCheckBox("Singing/Dancing");
        sub=new JButton("Submit");
        r=new JButton("Reset");

        f1.setLayout(null);

        head.setBounds(100, 10, 200, 20);
        fn.setBounds(30, 50, 80, 20);
        fnt.setBounds(120, 50, 150, 20);
        ln.setBounds(30, 80, 80, 20);
        lnt.setBounds(120, 80, 150, 20);
        email.setBounds(30, 110, 80, 20);
        emt.setBounds(120, 110, 150, 20);
        num.setBounds(30, 140, 100, 20);
        numt.setBounds(120, 140, 150, 20);
        gender.setBounds(30, 170, 80, 20);
        m.setBounds(120, 170, 50, 20);
        f.setBounds(180, 170, 50, 20);
        hob.setBounds(30, 200, 100, 20);
        p.setBounds(120, 200, 150, 20);
        C.setBounds(120, 220, 150, 20);
        S.setBounds(120, 240, 150, 20);
        sub.setBounds(100, 280, 80, 30);
        r.setBounds(200, 280, 80, 30);


        f1.add(head);
        f1.add(fn);
        f1.add(fnt);
        f1.add(ln);
        f1.add(lnt);
        f1.add(email);
        f1.add(emt);
        f1.add(num);
        f1.add(numt);
        f1.add(gender);
        f1.add(m);
        f1.add(f);
        f1.add(hob);
        f1.add(p);
        f1.add(C);
        f1.add(S);
        f1.add(sub);
        f1.add(r);

        f1.setSize(350, 370);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        sub.addActionListener(e -> {

            JOptionPane.showMessageDialog(f1, "Registration submitted successfully!");
        });

        r.addActionListener(e -> {

            fnt.setText("");
            lnt.setText("");
            emt.setText("");
            numt.setText("");
            m.setSelected(false);
            f.setSelected(false);
            p.setSelected(false);
            C.setSelected(false);
            S.setSelected(false);
        });
    }

    public static void main(String[] args) {
        RegistrationForm registrationForm = new RegistrationForm();
    }
}
