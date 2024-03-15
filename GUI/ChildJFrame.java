package GUI;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class ChildJFrame  {
    public static void main(String[] args) {
        JLabel label=new JLabel();
        label.setText("bro how are you");
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);
    }
}
