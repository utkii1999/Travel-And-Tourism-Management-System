package travel.tourism.management;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dashboard extends JFrame implements ActionListener {
        JButton b1,b13,b14,b2;
        String username;

    Dashboard(String username) {
        this.username=username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);//Full size frame automatically
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 1950, 65);
        p1.setBackground(new Color(0, 0, 102));
        add(p1);
        
         ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("travel/tourism/management/icons/dashboard.png"));
        Image i5 = i4.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(5, 0, 65, 65);
        p1.add(l2);
        
        JLabel l3=new JLabel("Dashboard");
        l3.setFont(new Font("Tahoma",Font.BOLD,30));
        l3.setForeground(Color.WHITE);
        l3.setBounds(80, 10,300, 40);
        p1.add(l3);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0, 65, 300, 1000);
        p2.setBackground(new Color(0, 0, 102));
        add(p2);
        
        b1=new JButton("Add Personal Details");
        b1.setBackground(new Color(0,0,102));
        b1.setFont(new Font("Tahoma",Font.PLAIN,20));
        b1.setForeground(Color.WHITE);
        b1.setBounds(0, 0, 300, 50);
        b1.addActionListener(this);
       // set button text left 
       //b1.setMargin(new Insets(0,0,0,60));
        p2.add(b1);
        
        b2=new JButton("Update Personal Details");
        b2.setBackground(new Color(0,0,102));
        b2.setFont(new Font("Tahoma",Font.PLAIN,20));
        b2.setForeground(Color.WHITE);
        b2.setBounds(0, 50, 300,50 );
        b2.addActionListener(this);
//        b2.setMargin(new Insets(0,0,0,30));
        p2.add(b2);
        
        JButton b3=new JButton("View Details");
        b3.setBackground(new Color(0,0,102));
        b3.setFont(new Font("Tahoma",Font.PLAIN,20));
        b3.setForeground(Color.WHITE);
        b3.setBounds(0, 100, 300, 50);
//        b3.setMargin(new Insets(0,0,0,130));
        p2.add(b3);
        
        JButton b4=new JButton("Delete Personal Details");
        b4.setBackground(new Color(0,0,102));
        b4.setFont(new Font("Tahoma",Font.PLAIN,20));
        b4.setForeground(Color.WHITE);
        b4.setBounds(0, 150, 300, 50);
//        b4.setMargin(new Insets(0,0,0,30));
        p2.add(b4);
        
        JButton b5=new JButton("Check Packages");
        b5.setBackground(new Color(0,0,102));
        b5.setFont(new Font("Tahoma",Font.PLAIN,20));
        b5.setForeground(Color.WHITE);
        b5.setBounds(0, 200, 300, 50);
//        b5.setMargin(new Insets(0,0,0,100));
        p2.add(b5);
        
        JButton b6=new JButton("Book Package");
        b6.setBackground(new Color(0,0,102));
        b6.setFont(new Font("Tahoma",Font.PLAIN,20));
        b6.setForeground(Color.WHITE);
        b6.setBounds(0, 250, 300, 50);
//        b6.setMargin(new Insets(0,0,0,110));
        p2.add(b6);
        
        JButton b7=new JButton("View Booked Package");
        b7.setBackground(new Color(0,0,102));
        b7.setFont(new Font("Tahoma",Font.PLAIN,20));
        b7.setForeground(Color.WHITE);
        b7.setBounds(0, 300, 300, 50);
        p2.add(b7);
        
        JButton b8=new JButton("View Hotels");
        b8.setBackground(new Color(0,0,102));
        b8.setFont(new Font("Tahoma",Font.PLAIN,20));
        b8.setForeground(Color.WHITE);
        b8.setBounds(0, 350, 300, 50);
        p2.add(b8);
        
        JButton b9=new JButton("Book Hotel");
        b9.setBackground(new Color(0,0,102));
        b9.setFont(new Font("Tahoma",Font.PLAIN,20));
        b9.setForeground(Color.WHITE);
        b9.setBounds(0, 400, 300, 50);
        p2.add(b9);
        
        JButton b10=new JButton("View Booked Hotel");
        b10.setBackground(new Color(0,0,102));
        b10.setFont(new Font("Tahoma",Font.PLAIN,20));
        b10.setForeground(Color.WHITE);
        b10.setBounds(0, 450, 300, 50);
        p2.add(b10);
        
        JButton b11=new JButton("Destinations");
        b11.setBackground(new Color(0,0,102));
        b11.setFont(new Font("Tahoma",Font.PLAIN,20));
        b11.setForeground(Color.WHITE);
        b11.setBounds(0, 500, 300, 50);
        p2.add(b11);
        
        JButton b12=new JButton("Payment");
        b12.setBackground(new Color(0,0,102));
        b12.setFont(new Font("Tahoma",Font.PLAIN,20));
        b12.setForeground(Color.WHITE);
        b12.setBounds(0, 550, 300, 50);
        p2.add(b12);
        
        b13=new JButton("Calculator");
        b13.setBackground(new Color(0,0,102));
        b13.setFont(new Font("Tahoma",Font.PLAIN,20));
        b13.setForeground(Color.WHITE);
        b13.setBounds(0, 600, 300, 50);
        b13.addActionListener(this);
        p2.add(b13);
        
        b14=new JButton("Notepad");
        b14.setBackground(new Color(0,0,102));
        b14.setFont(new Font("Tahoma",Font.PLAIN,20));
        b14.setForeground(Color.WHITE);
        b14.setBounds(0, 650, 300, 50);
        b14.addActionListener(this);
        p2.add(b14);
        
        JButton b15=new JButton("About");
        b15.setBackground(new Color(0,0,102));
        b15.setFont(new Font("Tahoma",Font.PLAIN,20));
        b15.setForeground(Color.WHITE);
        b15.setBounds(0, 700, 300, 50);
        p2.add(b15);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/tourism/management/icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1950, 1000);
        add(l1);
        
        JLabel l4 =new JLabel("Travel And Tourism Management System");
        l4.setBounds(600,100,1000,70);
        l4.setFont(new  Font("Tahoma",Font.PLAIN,55));
        l4.setForeground(Color.WHITE);
        l1.add(l4);

    }
    
      @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b13)
        {
            try{
                Runtime.getRuntime().exec("calc.exe");
                
            }catch(Exception e){}
        }
        else if(ae.getSource()==b14)
        {
            try{
                Runtime.getRuntime().exec("notepad.exe");
                
            }
           catch(Exception e)
               {}
          }
            else if(ae.getSource()==b1)
                    {
                    new AddCustomer(username).setVisible(true);
                    } else if(ae.getSource()==b2)
                    {
                    new UpdateCustomer(username).setVisible(true);
                    }
    }

    public static void main(String[] args) {
        new Dashboard("").setVisible(true);

    }
}

 