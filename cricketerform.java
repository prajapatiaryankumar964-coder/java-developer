import javax.swing.*;
import java.awt.event.*;

public class cricketerform extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2;

    cricketerform()
    {
        l1 = new JLabel("Cricketer Name");
        l2 = new JLabel("Team Name");
        l3 = new JLabel("Matches");
        l4 = new JLabel("Runs");
        l5 = new JLabel("Average");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();

        t5.setEditable(false);

        b1 = new JButton("Submit");
        b2 = new JButton("Clear");

        setLayout(null);

        l1.setBounds(50,50,120,30);
        t1.setBounds(200,50,150,30);

        l2.setBounds(50,100,120,30);
        t2.setBounds(200,100,150,30);

        l3.setBounds(50,150,120,30);
        t3.setBounds(200,150,150,30);

        l4.setBounds(50,200,120,30);
        t4.setBounds(200,200,150,30);

        l5.setBounds(50,250,120,30);
        t5.setBounds(200,250,150,30);

        b1.setBounds(70,320,100,30);
        b2.setBounds(220,320,100,30);

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(l4); add(t4);
        add(l5); add(t5);
        add(b1); add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setTitle("Cricketer Information");
        setSize(450,450);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            int matches = Integer.parseInt(t3.getText());
            int runs = Integer.parseInt(t4.getText());

            double avg = (double)runs / matches;

            t5.setText(String.valueOf(avg));

            JOptionPane.showMessageDialog(this,
            "Cricketer : " + t1.getText()
            + "\nTeam : " + t2.getText()
            + "\nAverage : " + avg);
        }

        if(e.getSource()==b2)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
        }
    }

    public static void main(String args[])
    {
        new cricketerform();
    }
}