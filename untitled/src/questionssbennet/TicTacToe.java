package questionssbennet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe implements ActionListener {
    JFrame frame;
    JButton[][] buttons;
    JLabel statusLabel;
    boolean playerX;

    TicTacToe() {
        frame = new JFrame("Tic-Tac-Toe");
        buttons = new JButton[3][3];
        statusLabel = new JLabel("Player X's turn");
        playerX = true;

        JPanel panel = new JPanel(new GridLayout(3, 3));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setFont(new Font("Arial", Font.PLAIN, 60));
                buttons[i][j].addActionListener(this);
                panel.add(buttons[i][j]);
            }
        }

        JPanel statusPanel = new JPanel(new FlowLayout());
        statusPanel.add(statusLabel);

        frame.add(panel, BorderLayout.CENTER);
        frame.add(statusPanel, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        if (!clickedButton.getText().equals("")) {
            return;
        }

        if (playerX) {
            clickedButton.setText("X");
            statusLabel.setText("Player O's turn");
        } else {
            clickedButton.setText("O");
            statusLabel.setText("Player X's turn");
        }

        if (checkForWin()) {
            if (playerX) {
                statusLabel.setText("Player X wins!");
            } else {
                statusLabel.setText("Player O wins!");
            }
            disableAllButtons();
        } else if (checkForTie()) {
            statusLabel.setText("It's a tie!");
            disableAllButtons();
        } else {
            playerX = !playerX;
        }
    }

    private boolean checkForWin() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (buttons[i][0].getText().equals(buttons[i][1].getText()) &&
                    buttons[i][1].getText().equals(buttons[i][2].getText()) &&
                    !buttons[i][0].getText().equals("")) {
                return true;
            }
        }
        // Check columns
        for (int i = 0; i < 3; i++) {
            if (buttons[0][i].getText().equals(buttons[1][i].getText()) &&
                    buttons[1][i].getText().equals(buttons[2][i].getText()) &&
                    !buttons[0][i].getText().equals("")) {
                return true;
            }
        }
        // Check diagonals
        if (buttons[0][0].getText().equals(buttons[1][1].getText()) &&
                buttons[1][1].getText().equals(buttons[2][2].getText()) &&
                !buttons[0][0].getText().equals("")) {
            return true;
        }
        if (buttons[0][2].getText().equals(buttons[1][1].getText()) &&
                buttons[1][1].getText().equals(buttons[2][0].getText()) &&
                !buttons[0][2].getText().equals("")) {
            return true;
        }
        return false;
    }

    private boolean checkForTie() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (buttons[i][j].getText().equals("")) {
                    return false;
                }
            }
        }
        return true;
    }

    private void disableAllButtons() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setEnabled(false);
            }
        }
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}
