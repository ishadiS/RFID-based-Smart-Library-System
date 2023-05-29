
import java.sql.Connection;

import java.sql.DriverManager;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author HP
 */
    
public class Connect_Online
{
    public static Connection Online()
    {
        Connection conn = null;
        
        String host_name = "localhost";
        
        String db_name = "sltc_library";

        String database_url = "jdbc:mysql://"+host_name+":"+3306+"/"+db_name+"?autoReconnect=true"; // Database URL

        String user_name = "root"; // Add User name

        String password = "root"; // Password

        try
        {
           conn = DriverManager.getConnection(database_url, user_name, password);

            System.out.println("Connected To remotemysql.com:3306/C5tbieTCrC");
        }
        catch (Exception ERROR)
        {
            System.out.println("Error Message : "+ERROR);
        }
        return conn;
    }
    
    public static void main(String[] args)
    {
        Online();
    }
    
}


