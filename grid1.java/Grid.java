import java.awt.*;
import javax.swing.*;

public class Grid {
    JFrame f;

    Grid() {
        f = new JFrame("Application");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");

        // Set bounds for buttons
        b1.setBounds(15, 20, 50, 30);
        b2.setBounds(70, 20, 50, 30);
        b3.setBounds(125, 20, 50, 30);
        b4.setBounds(180, 20, 50, 30);
        b5.setBounds(235, 20, 50, 30);
        b6.setBounds(290, 20, 50, 30);
        b7.setBounds(345, 20, 50, 30);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);

        f.setSize(400, 400);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(new Color(89, 129, 110));
        f.setLayout(new GridLayout(3, 2));
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new Grid();
    }
}
