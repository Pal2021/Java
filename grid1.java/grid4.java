import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class grid4 {
    grid4() {
        JFrame f = new JFrame("Combo Box Color");
        String colors[] = {"red", "green", "yellow"};
        JComboBox<String> cb = new JComboBox<String>(colors);
        cb.setBounds(15, 20, 80, 30);
        cb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s = (String) cb.getSelectedItem();
                switch (s) {
                    case "red":
                        f.getContentPane().setBackground(Color.red);
                        break;
                    case "yellow":
                        f.getContentPane().setBackground(Color.yellow);
                        break;
                    case "green":
                        f.getContentPane().setBackground(Color.green);
                        break;
                    default:
                        // Handle default case
                }
            }
        });
        f.add(cb);
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new grid4();
    }
}
