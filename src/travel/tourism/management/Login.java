package travel.tourism.management;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Login extends JFrame implements ActionListener{
     JButton b1,b2,b3;
      JTextField t1;
      JPasswordField t2;

    Login() {
        setBounds(550, 250, 800, 400);
        getContentPane().setBackground(Color.WHITE);
        // setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBounds(0, 0, 380, 400);
        p1.setBackground(new Color(133, 193, 233));
        p1.setLayout(null);
        add(p1);

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("travel/tourism/management/icons/login.png"));
        JLabel l1 = new JLabel(i);
        l1.setBounds(30, 30, 300, 300);
        p1.add(l1);

        JPanel p2 = new JPanel();
        p2.setBounds(380, 20, 380, 315);
        p2.setLayout(null);
        add(p2);

        JLabel l2 = new JLabel("Username");
        l2.setBounds(60, 30, 100, 30);
        l2.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        p2.add(l2);

        t1 = new JTextField();
        t1.setBounds(60, 70, 200, 30);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t1);

        JLabel l3 = new JLabel("Password");
        l3.setBounds(60, 120, 100, 30);
        l3.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        p2.add(l3);

        t2 = new JPasswordField();
        t2.setBounds(60, 160, 200, 30);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t2);

        b1 = new JButton("LogIn");
        b1.setBounds(60, 210, 80, 30);
        b1.setBackground(new Color(133, 193, 233));
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.addActionListener(this);
        p2.add(b1);

        b2 = new JButton("SignUp");
        b2.setBounds(180, 210, 80, 30);
        b2.setBackground(new Color(133, 193, 233));
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.addActionListener(this);
        p2.add(b2);

        b3 = new JButton("Forgot Password");
        b3.setBounds(90, 260, 133, 30);
        b3.setBorder(new LineBorder(new Color(133, 193, 233)));
        b3.addActionListener(this);
        p2.add(b3);

        JLabel l4 = new JLabel("Trouble In LogIn!!!");
        l4.setBounds(230, 260, 130, 30);
        l4.setForeground(Color.red);
        p2.add(l4);

        setVisible(true);

    }
    
     @Override
    public void actionPerformed(ActionEvent ae) {
          Conn c=new Conn();
        if(ae.getSource()==b1)
        {
             try{
                 
               String sql="select * from account where username=' "+t1.getText()+" ' AND password = ' "+t2.getText()+" ' "; 
                ResultSet rs=c.s.executeQuery(sql);
                if(rs.next())
                {
                    
                    this.setVisible(false);
                    new Loading(t1.getText()).setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Invalid Login");
                }
            }catch(Exception e)
            {
                
            }
           
        }else if(ae.getSource()==b2)
        {
              this.setVisible(false);
            new Signup().setVisible(true);
          
            
        }else if(ae.getSource()==b3)
        {
            this.setVisible(false);
            new ForgotPassword().setVisible(true);
            
        }
            
        
        
        
    }

    public static void main(String[] args) {
        new Login();
    }

   
}