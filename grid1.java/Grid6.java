import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Grid6 extends Frame implements MouseMotionListener {
    
    public Grid6() {
        addMouseMotionListener(this);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }

    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(new Color(200, 140, 50, 20));
        g.fillOval(e.getX(), e.getY(), 30, 20); 
    }

    public void mouseMoved(MouseEvent e) {
    }

    public static void main(String[] args) {
        new Grid6();
    }
}

