package com.jdbc_master;
import java.sql.*;
public class Connection_Master {
	 static String URL="jdbc:mysql://localhost:3306/jdbc_master";
	   static String USERNAME="root";
	   static String PASSWORD="root";
	   
	   public static Connection getConnection() {
		   try {
			   
			   Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
	            return conn;
		   }catch(Exception e) {
			   
		   }
		return null;
	   }
}
