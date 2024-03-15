import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Grid2 implements KeyListener {
    JFrame f;
    JLabel l;
    JTextArea ta;

    Grid2() {
        f = new JFrame("Application");
        l = new JLabel();
        l.setBounds(180, 130, 200, 30);
        l.setForeground(Color.white); // Correct method name
        ta = new JTextArea();
        ta.setBounds(50, 30, 300, 100);
        ta.addKeyListener(this); // Correct method name
        f.add(l);
        f.add(ta); // Adding the text area to the frame
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(new Color(89, 129, 110)); // Correct method name
        f.setLayout(null);
        f.setSize(400, 300); // Setting frame size
        f.setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        l.setText("Key pressed event");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        l.setText("Key released event");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not handling keyTyped event in this example
    }

    public static void main(String[] args) {
        new Grid2();
    }
}
