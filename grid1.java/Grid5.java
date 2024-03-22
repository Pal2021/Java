import java.awt.*;
import java.awt.event.*;

public class Grid5 extends Frame implements MouseListener {
    
    public Grid5() {
        addMouseListener(this);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(new Color(170, 140, 50, 20));
        g.fillRect(e.getX(), e.getY(), 20, 20); // Draws a rectangle at the mouse click position
    }

    // These methods are part of the MouseListener interface, so they must be implemented
    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public static void main(String[] args) {
        new Grid5();
    }
}
