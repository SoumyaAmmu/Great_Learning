package com.greatlearning.designpatter1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {


	  
    private static Connection con = null;
  
    static
    {
        String url = "jdbc:mysql://localhost:1433/master";
        String user = "SOUMYAREDDY\\MS_SQL";
        String pass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Database connection established");
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection()
    {
        return con;
    }
}
