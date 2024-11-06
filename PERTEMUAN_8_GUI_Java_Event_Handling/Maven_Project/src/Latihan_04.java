import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Latihan_04 extends JFrame implements MouseListener {
    private JButton[][] buttons = new JButton[3][3];
    private boolean xTurn = true;  
    private int scoreX = 0, scoreO = 0;
    private JLabel scoreLabel;

    public Latihan_04() {
        setTitle("Tic Tac Toe");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        scoreLabel = new JLabel("Score X:" + scoreX + " O:" + scoreO);
        add(scoreLabel, BorderLayout.NORTH);
        
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(new Font("Arial", Font.PLAIN, 60));
                buttons[i][j].setFocusPainted(false);
                buttons[i][j].addMouseListener(this);
                panel.add(buttons[i][j]);
            }
        }
        add(panel, BorderLayout.CENTER);
    }

    
    public void mouseClicked(MouseEvent e) {
        JButton buttonClicked = (JButton) e.getSource();
        
        
        if (!buttonClicked.getText().equals("")) {
            return;
        }
        
        
        buttonClicked.setText(xTurn ? "X" : "O");
        
        
        if (checkWinner()) {
            String winner = xTurn ? "X" : "O";
            JOptionPane.showMessageDialog(this, winner + " got point 1");
            if (xTurn) {
                scoreX++;
            } else {
                scoreO++;
            }
            updateScore();
            resetBoard();
        } else if (isBoardFull()) {
            JOptionPane.showMessageDialog(this, "It's a draw!");
            resetBoard();
        }
        
        
        xTurn = !xTurn;
    }

    private void updateScore() {
        scoreLabel.setText("Score X:" + scoreX + " O:" + scoreO);
    }

    private boolean checkWinner() {
        
        for (int i = 0; i < 3; i++) {
            if (buttons[i][0].getText().equals(buttons[i][1].getText()) &&
                buttons[i][1].getText().equals(buttons[i][2].getText()) &&
                !buttons[i][0].getText().equals("")) {
                return true;
            }
            if (buttons[0][i].getText().equals(buttons[1][i].getText()) &&
                buttons[1][i].getText().equals(buttons[2][i].getText()) &&
                !buttons[0][i].getText().equals("")) {
                return true;
            }
        }
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

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (buttons[i][j].getText().equals("")) {
                    return false;
                }
            }
        }
        return true;
    }

    private void resetBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
            }
        }
    }

    
    public void mousePressed(MouseEvent e) {}

    
    public void mouseReleased(MouseEvent e) {}

    
    public void mouseEntered(MouseEvent e) {}

    
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Latihan_04().setVisible(true);
        });
    }
}
