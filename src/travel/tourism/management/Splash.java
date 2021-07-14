package travel.tourism.management;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Image;

public class Splash {
    public static void main(String[] args) {
        SplashFrame frame=new SplashFrame();
        frame.setVisible(true);
        int x=1;
        for(int i=2;i<=600;i+=10,x+=7)
        {
        frame.setLocation(900-((i+x)/2), 500-(i/2)); 
        frame.setSize(x+i,i);
        try{
            Thread.sleep(6);
        }
        catch(Exception e){}
        }
        
    }
    
}
class SplashFrame extends JFrame implements Runnable
{
    Thread t1;
    SplashFrame()
    {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/tourism/management/icons/splash.jpg"));
        Image i2=i1.getImage().getScaledInstance(1030,750,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        add(l1);
        setUndecorated(true);
        t1=new Thread(this);
        t1.start();
    }

    @Override
    public void run() {
       try{
           Thread.sleep(7000);
           this.setVisible(false);
           new Login().setVisible(true);
       }catch(Exception e)
       {
           e.printStackTrace();
       }
       
    }
    
}
