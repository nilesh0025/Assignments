package com.jdbc_master;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update_Master {
  public static void main(String[] args) {
	
	  
	 
	  
	  try {
		  Scanner sc=new Scanner(System.in);
		  Connection conn=Connection_Master.getConnection();
		PreparedStatement ps=conn.prepareStatement("update employee set ename=?,salary=?,designation=? where id=?");
		System.out.println("enter employee name :");
		ps.setString(1,sc.nextLine());
		System.out.println("enter salary :");
		ps.setInt(2,Integer.parseInt(sc.nextLine()));
		System.out.println("enter designation :");
		ps.setString(3, sc.nextLine());
		System.out.println("eneter id");
		ps.setInt(4, Integer.parseInt(sc.nextLine()));
		
	int i=	ps.executeUpdate();
		if(i==1) {
			System.out.println("Updated Successfully");
		}
		conn.close();
		
	} catch (SQLException e) {
		
		System.out.println(e.getMessage());
	}
	  
}
}
