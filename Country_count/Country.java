package Country_count;
import javax.swing.*;
import java.awt.event.*;

class Country {
    JFrame f;

    Country() {
        f = new JFrame("JList application");
        DefaultListModel<String> con = new DefaultListModel<>();
        con.addElement("india");
        con.addElement("china");
        con.addElement("japan");
        con.addElement("koria");
        con.addElement("US");

        JList<String> li = new JList<>(con);
        li.setBounds(40, 40, 90, 110);

        JLabel l = new JLabel();
        l.setText("Select a country:");
        l.setBounds(25, 30, 120, 30);

        JButton b = new JButton("Country");
        b.setBounds(180, 90, 100, 30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "";
                if (li.getSelectedIndex() != -1) {
                    data = "Selected Country : " + li.getSelectedValue();
                    JOptionPane.showMessageDialog(f, data); 
                }
            }
        });

        f.add(li);
        f.add(l);
        f.add(b);

        f.setSize(400, 400);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Country();
    }
}
