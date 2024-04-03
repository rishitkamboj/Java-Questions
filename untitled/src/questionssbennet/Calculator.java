package questionssbennet;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

enum Operator {
    PLUS,
    MINUS,
    TIMES,
    DIVIDE
}

public class Calculator implements ActionListener {
    /* Application Frame */
    JFrame frame = new JFrame("Calculator by Tanvi");

    /* Result Box */
    JTextField result = new JTextField(20);

    /* Control Buttons */
    static JButton addBtn = new JButton("+");
    static JButton subtractBtn = new JButton("-");
    static JButton multiplyBtn = new JButton("x");
    static JButton divideBtn = new JButton("%");
    static JButton equalBtn = new JButton("=");
    static JButton clearBtn = new JButton("C");

    /* Number Buttons */
    static JButton zeroBtn = new JButton("0");
    static JButton oneBtn = new JButton("1");
    static JButton twoBtn = new JButton("2");
    static JButton threeBtn = new JButton("3");
    static JButton fourBtn = new JButton("4");
    static JButton fiveBtn = new JButton("5");
    static JButton sixBtn = new JButton("6");
    static JButton sevenBtn = new JButton("7");
    static JButton eightBtn = new JButton("8");
    static JButton nineBtn = new JButton("9");

    /* Other instance variables */
    int operand1 = 0, operand2 = 0, resultNum = 0;
    Operator operator;

    public static void main(String[] args) {
        new Calculator();
    }

    public Calculator() {
        /* Set frame properties */
        frame.setVisible(true);
        frame.setSize(350, 500);
        frame.setLayout(null);
        frame.setBackground(Color.gray);

        /* Set bounds to objects in the frame */
        result.setBounds(20, 50, 300, 40);

        sevenBtn.setBounds(55, 100, 50, 50);
        eightBtn.setBounds(115, 100, 50, 50);
        nineBtn.setBounds(175, 100, 50, 50);
        clearBtn.setBounds(235, 100, 50, 50);

        fourBtn.setBounds(55, 180, 50, 50);
        fiveBtn.setBounds(115, 180, 50, 50);
        sixBtn.setBounds(175, 180, 50, 50);
        addBtn.setBounds(235, 180, 50, 50);

        oneBtn.setBounds(55, 260, 50, 50);
        twoBtn.setBounds(115, 260, 50, 50);
        threeBtn.setBounds(175, 260, 50, 50);
        subtractBtn.setBounds(235, 260, 50, 50);

        zeroBtn.setBounds(55, 340, 50, 50);
        multiplyBtn.setBounds(115, 340, 50, 50);
        divideBtn.setBounds(175, 340, 50, 50);
        equalBtn.setBounds(235, 340, 50, 50);

        /* Add objects to the frame */
        frame.add(result);

        frame.add(sevenBtn);
        frame.add(eightBtn);
        frame.add(nineBtn);
        frame.add(clearBtn);

        frame.add(fourBtn);
        frame.add(fiveBtn);
        frame.add(sixBtn);
        frame.add(addBtn);

        frame.add(oneBtn);
        frame.add(twoBtn);
        frame.add(threeBtn);
        frame.add(subtractBtn);

        frame.add(zeroBtn);
        frame.add(multiplyBtn);
        frame.add(divideBtn);
        frame.add(equalBtn);

        /* Attach event listeners */
        sevenBtn.addActionListener(this);
        eightBtn.addActionListener(this);
        nineBtn.addActionListener(this);
        fourBtn.addActionListener(this);
        fiveBtn.addActionListener(this);
        sixBtn.addActionListener(this);
        oneBtn.addActionListener(this);
        twoBtn.addActionListener(this);
        threeBtn.addActionListener(this);
        zeroBtn.addActionListener(this);

        clearBtn.addActionListener(this);
        addBtn.addActionListener(this);
        subtractBtn.addActionListener(this);
        multiplyBtn.addActionListener(this);
        divideBtn.addActionListener(this);
        equalBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JButton eventSourceBtn = (JButton) event.getSource();

        if (eventSourceBtn == addBtn) {
            operand1 = Integer.parseInt(result.getText());
            operator = Operator.PLUS;
            result.setText("");
        } else if (eventSourceBtn == subtractBtn) {
            operand1 = Integer.parseInt(result.getText());
            operator = Operator.MINUS;
            result.setText("");
        } else if (eventSourceBtn == multiplyBtn) {
            operand1 = Integer.parseInt(result.getText());
            operator = Operator.TIMES;
            result.setText("");
        } else if (eventSourceBtn == divideBtn) {
            operand1 = Integer.parseInt(result.getText());
            operator = Operator.DIVIDE;
            result.setText("");
        } else if (eventSourceBtn == clearBtn) {
            result.setText("0");
        } else if (eventSourceBtn == zeroBtn) {
            result.setText(result.getText() + "0");
        } else if (eventSourceBtn == oneBtn) {
            result.setText(result.getText() + "1");
        } else if (eventSourceBtn == twoBtn) {
            result.setText(result.getText() + "2");
        } else if (eventSourceBtn == threeBtn) {
            result.setText(result.getText() + "3");
        } else if (eventSourceBtn == fourBtn) {
            result.setText(result.getText() + "4");
        } else if (eventSourceBtn == fiveBtn) {
            result.setText(result.getText() + "5");
        } else if (eventSourceBtn == sixBtn) {
            result.setText(result.getText() + "6");
        } else if (eventSourceBtn == sevenBtn) {
            result.setText(result.getText() + "7");
        } else if (eventSourceBtn == eightBtn) {
            result.setText(result.getText() + "8");
        } else if (eventSourceBtn == nineBtn) {
            result.setText(result.getText() + "9");
        } else if (eventSourceBtn == equalBtn) {
            operand2 = Integer.parseInt(result.getText());

            switch (operator) {
                case PLUS:
                    resultNum = operand1 + operand2;
                    break;
                case MINUS:
                    resultNum = operand1 - operand2;
                    break;
                case TIMES:
                    resultNum = operand1 * operand2;
                    break;
                case DIVIDE:
                    resultNum = operand1 / operand2;
                    break;
            }
            result.setText(resultNum + "");
        }
    }


}