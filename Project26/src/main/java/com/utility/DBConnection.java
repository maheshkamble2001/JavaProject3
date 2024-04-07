package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static String url = "jdbc:mysql://localhost:3306/demodb";
	public static String username="root";
	public static String password = "";
	public static Connection con;
	
	public static Connection DBConnectivity()
	{
		try {
			if(con !=null)
			{
				return con;
			}
			else
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(url,username,password);
			}
		}catch(Exception e)
		{
			System.out.print("Exception occured in connection "+e);
		}
		return con;
	}
}
