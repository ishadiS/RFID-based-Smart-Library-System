
import SQL_Connector.Connector;

import java.sql.Connection;

import java.sql.ResultSet;

import java.sql.Statement;

public class book_valid 
{
    
    public static int validation_lending(int card_id)
    {
        Connection connection =  Connector.connection();
        
        String SQL = "SELECT * FROM lend_books WHERE MEMBERSHIP_ID ='"+card_id+"'; ";
            
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
                    
            if(!rs.next())
            {
                System.out.print("0");
                
                return 0;
            }
            else
            {
                System.out.print("1");
                
                return 1;
            }
        }
        catch(Exception ERROR)
        {
            System.out.println(ERROR);
            
            return 0;
        }
    }
    
    public static void main(String args[])
    {
        validation_lending(1983);
    }
}

