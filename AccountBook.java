package accountbook;
//import java.sql.Connection;
//import java.sql.Statement;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;


public class AccountBook 
{
    
   

    
    public static void main(String[] args) 
    
   
    
    {
        
        
//        final String DATABASE_URL = "jdbc:sqlserver://localhost:1433;databaseName=AccountBook;" + "integratedSecurity=true";
//        final String SELECT_QUERY = "SELECT Name, Date, Amount, Description FROM Sales";
//        
//          try(Connection con = DriverManager.getConnection(DATABASE_URL);
//                Statement statement = con.createStatement();
//                ResultSet resultSet = statement.executeQuery(SELECT_QUERY))
//        {
//          System.out.println("Sales Table\n");
//          
//          //display table colums
//          System.out.println("Name\tDate\tAmount\tDescription");
//          
//          //display the row of the resultset
//          while (resultSet.next())
//          {
//              System.out.printf("%d\t", resultSet.getString("Name"));
//              System.out.printf("%s\t\t", resultSet.getString("Date"));
//              System.out.printf("%s\t\t", resultSet.getInt("Amount"));
//              System.out.printf("%s\t\n", resultSet.getString("Description"));
//          }
//        }
//          
//           catch (SQLException e)
//        {
//            e.printStackTrace();
//        }
    
        new WELCOME().setVisible(true);
    }
      
}
