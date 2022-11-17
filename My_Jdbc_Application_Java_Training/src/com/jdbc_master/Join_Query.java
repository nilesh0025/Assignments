package com.jdbc_master;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Join_Query {
public static void main(String[] args) {
	
	
	
	try {
		Connection conn=Connection_Master.getConnection();
		
		Scanner sc = new Scanner(System.in);
		
		PreparedStatement st=conn.prepareStatement(" select department.deptid,department.dname,employee.ename from employee join department on employee.deptid=department.deptid where department.deptid=?");
		System.out.println("Enter Department id:");
		
		st.setInt(1,sc.nextInt());
		
		ResultSet rs=st.executeQuery();
		while(rs.next()) {
		//System.out.println(rs.getInt("id")+" "+rs.getString("ename")+" "+rs.getInt("salary")+" "+rs.getInt("deptid")+" "+rs.getString("designation"));
		System.out.println(rs.getInt("deptid")+"  "+rs.getString("ename")+"  "+rs.getString("dname")+ "  ");
		
		
		}
		
		
	} catch (SQLException e) {
		
	System.out.println(e.getMessage());
	}
	
}
}
