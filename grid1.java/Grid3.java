import java.awt.*;
import javax.swing.*;

public class Grid3 extends Canvas {
    public void paint(Graphics g) {
        Font font = new Font("Dialog", Font.BOLD, 22);
        g.setFont(font);
        g.setColor(Color.BLUE); // Set foreground color
        g.drawString("Mr. pal", 30, 20);
        g.setColor(Color.YELLOW); // Set background color
        g.fillRect(150, 150, 400, 400);
        g.setColor(Color.BLACK); // Reset color for shapes
        g.drawOval(200, 200, 200, 200); // Adjust parameters accordingly
        g.drawArc(250, 250, 100, 100, 0, 90); // Adjust parameters accordingly
        g.fillArc(300, 300, 100, 100, 0, 90); // Adjust parameters accordingly
        g.fillOval(350, 350, 100, 100); // Adjust parameters accordingly
    }

    public static void main(String args[]) {
        Grid3 d = new Grid3();
        JFrame f = new JFrame("Application");
        f.add(d);
        f.setSize(600, 600);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
