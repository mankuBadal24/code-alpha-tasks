import javax.swing.*;
import java.awt.event.*;

public class WordCounter extends JFrame implements ActionListener {
    JLabel lb1, lb2;
    JTextArea ta;
    JButton b;

    WordCounter() {
        super("Char Word count tool by Mayank Badal ");
        lb1 = new JLabel("characters : ");
        lb1.setBounds(50, 50, 100, 20);
        lb2 = new JLabel(" words : ");
        lb2.setBounds(50, 80, 100, 20);

        ta = new JTextArea();
        JScrollPane sp = new JScrollPane(ta);
        sp.setBounds(50, 110, 300, 200);

        b = new JButton("Count");
        b.setBounds(50, 320, 80, 30);
        b.addActionListener(this);

        add(lb1);
        add(lb2);
        add(sp);
        add(b);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b)
        {
        String text = ta.getText();
        lb1.setText("Characters:  " + text.length());
        String words[] = text.split("\\s");
        lb2.setText("Words: "+words.length);
        }
    }
    public static void main(String[] args) {
        new WordCounter();
    }
}