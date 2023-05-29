
import Mails_Handler.Send_Mails;
import SQL_Connector.Connector;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class get_mail_address {
    public static void extract_emails(String id, String Subject, String Message)
    {
        Integer student_ID = Integer.valueOf(id);
        
         String SQL = "SELECT * FROM members WHERE Membership_ID = "+id+"";
        
         java.sql.Connection connection = Connector.connection();
         
         try
         {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
                String email = rs.getString("EMAIL_ADDRESS");
                
                Send_Mails.Send(Subject, Message, email);
                      
            }
            
           
         }
         catch(Exception ERROR)
         {
             System.out.println(ERROR);
         }
    
    
    }
    
}
