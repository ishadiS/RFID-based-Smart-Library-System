
import SQL_Connector.Connector;
import java.sql.ResultSet;
import java.sql.Statement;


public class date_validator 
{
    public static int  get_return_date(String id)
    {
        Integer mid = Integer.valueOf(id);
        
        String SQL = "SELECT * FROM lend_books WHERE Membership_ID = "+id+"";
        
         java.sql.Connection connection = Connector.connection();
         
         try
         {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
                String return_date = rs.getString("RETURN_DATE");
                System.out.println(return_date);
                
               int gap = Dates.Getdate.time_management(return_date);
                
               System.out.println(gap);
               
               return gap;
            }
         }
                
         catch(Exception ERROR)
         {
             System.out.println(ERROR);
             
             return 0;
         }
         
         return 0;
    }
    
    public static void main(String args[])
    {
        get_return_date("12345");
    }
    
}
