package com.Jdbc_Assignment;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.jdbc_master.Connection_Master;

public class Display_managers {
      public static void main(String[] args) {
		
	
	
	try {
		Connection conn=Connection_Master.getConnection();
		
		Scanner sc = new Scanner(System.in);
		
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(" select * from employee where designation='trainee'");
		System.out.println("Designation Manager Employees:");
		while(rs.next()) {
			System.out.println(rs.getInt("id")+" "+rs.getString("ename")+" "+rs.getInt("salary")+" "+rs.getInt("deptid")+" "+rs.getString("designation"));

		}
}catch(Exception e) {
	System.out.println(e.getMessage());
}
}
}