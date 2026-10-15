import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class shoppingsystem extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4,t5,t6;
    JButton b1,b2;

    shoppingsystem()
    {
        setTitle("Discount Calculator");

        l1 = new JLabel("Customer Name");
        l2 = new JLabel("Product Name");
        l3 = new JLabel("Price");
        l4 = new JLabel("Discount %");
        l5 = new JLabel("Discount Amount");
        l6 = new JLabel("Net Price");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();

        t5.setEditable(false);
        t6.setEditable(false);

        b1 = new JButton("Submit");
        b2 = new JButton("Clear");

        setLayout(null);

        l1.setBounds(100,50,120,30);
        t1.setBounds(250,50,180,30);

        l2.setBounds(100,100,120,30);
        t2.setBounds(250,100,180,30);

        l3.setBounds(100,150,120,30);
        t3.setBounds(250,150,180,30);

        l4.setBounds(100,200,120,30);
        t4.setBounds(250,200,180,30);

        l5.setBounds(100,250,120,30);
        t5.setBounds(250,250,180,30);

        l6.setBounds(100,300,120,30);
        t6.setBounds(250,300,180,30);

        b1.setBounds(100,380,120,40);
        b2.setBounds(300,380,120,40);

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(l4); add(t4);
        add(l5); add(t5);
        add(l6); add(t6);
        add(b1); add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setSize(550,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            double price = Double.parseDouble(t3.getText());
            double discount = Double.parseDouble(t4.getText());

            double disAmount = (price * discount)/100;
            double netPrice = price - disAmount;

            t5.setText(String.valueOf(disAmount));
            t6.setText(String.valueOf(netPrice));

            JOptionPane.showMessageDialog(this,
                    "Customer : " + t1.getText()
                    + "\nProduct : " + t2.getText()
                    + "\nNet Price : " + netPrice);
        }

        if(e.getSource()==b2)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
        }
    }

    public static void main(String args[])
    {
        new shoppingsystem();
    }
}