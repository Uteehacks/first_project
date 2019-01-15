
package accountbook;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class javaconnect {
    
    Connection conn=null;

        public static Connection Connect()
        {
        try
            {
        Connection conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=AccountBook;" + "integratedSecurity=true" );
            
            return conn;
            }
        

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Database Error");
        }
        return null;
      
    }
}
