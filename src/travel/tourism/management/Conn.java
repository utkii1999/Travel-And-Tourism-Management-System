
package travel.tourism.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection c;
    Statement s;
    
    public Conn()
    {
        try{
            
            //Register the Driver Class
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Create connection string
          c= DriverManager.getConnection("jdbc:mysql://localhost:3306/tms","root", "root");
          //Create Statement
          s=c.createStatement();
           
           
            
            
        }catch(Exception e)
        {
            
        }
    }
    
}
