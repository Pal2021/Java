package GUI;
import java.awt.Color;

import javax.swing.JFrame;
public class Jframe1 {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("This is my title");
        frame.getContentPane().setBackground(Color.gray);
    }
}
