import javax.swing.*;
import java.awt.event.*;

public class awmcalculator extends JFrame implements ActionListener
{
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4,b5,b6;

    awmcalculator()
    {
        l1=new JLabel("Enter Value 1");
        l2=new JLabel("Enter Value 2");
        l3=new JLabel("Result");

        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();

        t3.setEditable(false);

        b1=new JButton("Sum +");
        b2=new JButton("Sub -");
        b3=new JButton("Mul *");
        b4=new JButton("Div /");
        b5=new JButton("Clear");
        b6=new JButton("Exit");

        setLayout(null);

        l1.setBounds(50,50,120,30);
        t1.setBounds(180,50,150,30);

        l2.setBounds(50,100,120,30);
        t2.setBounds(180,100,150,30);

        b1.setBounds(40,160,80,30);
        b2.setBounds(130,160,80,30);
        b3.setBounds(220,160,80,30);
        b4.setBounds(310,160,80,30);

        b5.setBounds(110,210,80,30);
        b6.setBounds(220,210,80,30);

        l3.setBounds(50,260,120,30);
        t3.setBounds(180,260,150,30);

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);

        add(b1); add(b2);
        add(b3); add(b4);
        add(b5); add(b6);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);

        setTitle("Calculator");
        setSize(450,350);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        int a,b,ans;

        if(e.getSource()==b1)
        {
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());
            ans=a+b;
            t3.setText(String.valueOf(ans));
        }

        if(e.getSource()==b2)
        {
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());
            ans=a-b;
            t3.setText(String.valueOf(ans));
        }

        if(e.getSource()==b3)
        {
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());
            ans=a*b;
            t3.setText(String.valueOf(ans));
        }

        if(e.getSource()==b4)
        {
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());
            ans=a/b;
            t3.setText(String.valueOf(ans));
        }

        if(e.getSource()==b5)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }

        if(e.getSource()==b6)
        {
            System.exit(0);
        }
    }

    public static void main(String args[])
    {
        new awmcalculator();
    }
}