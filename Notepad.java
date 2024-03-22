import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Notepad implements ActionListener {
    JFrame f;
    JMenuBar mb;
    JMenu file, edit, help;
    JMenuItem open, save, exit, cut, copy, paste, about, New, selectAll;
    JTextArea ta = new JTextArea(15, 40);

    public Notepad() {
        f = new JFrame("NotePad");
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        about = new JMenuItem("About");
        open = new JMenuItem("Open...");
        save = new JMenuItem("Save As...");
        exit = new JMenuItem("Exit");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        about.addActionListener(this);
        selectAll = new JMenuItem("Select All");
        selectAll.addActionListener(this);

        New = new JMenuItem("New"); // Added New menu item
        New.addActionListener(this); // Added action listener to New menu item

        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll); // Added selectAll to the edit menu
        help.add(about);
        file.add(open);
        file.add(save);
        file.add(New); // Added New menu item to the file menu
        file.add(exit);
        mb.add(file);
        mb.add(edit);
        mb.add(help);
        ta = new JTextArea();
        ta.setBounds(5, 5, 700, 700);
        f = new JFrame("Notepad Editor");
        f.add(mb, BorderLayout.NORTH); // Added BorderLayout.NORTH to position menu bar at the top
        f.add(new JScrollPane(ta)); // Added JScrollPane to enable scrolling
        f.setJMenuBar(mb);
        f.setSize(700, 800);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new BorderLayout()); // Set layout to BorderLayout
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut) {
            ta.cut();
        } else if (e.getSource() == copy) {
            ta.copy();
        } else if (e.getSource() == paste) {
            ta.paste();
        } else if (e.getSource() == selectAll) {
            ta.selectAll();
        } else if (e.getSource() == about) {
            JOptionPane.showMessageDialog(f, "This is a simple notepad application.");
        } else if (e.getSource() == New) { // Handle action for New menu item
            ta.setText(""); // Clear the text area when New is clicked
        }
    }

    public static void main(String[] args) {
        new Notepad();
    }
}
