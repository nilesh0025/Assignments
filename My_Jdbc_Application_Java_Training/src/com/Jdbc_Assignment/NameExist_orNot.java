package com.Jdbc_Assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.jdbc_master.Connection_Master;

public class NameExist_orNot {
public static void main(String[] args) {
	try {
		Connection conn=Connection_Master.getConnection();
		
		Scanner sc = new Scanner(System.in);
		
		PreparedStatement st=conn.prepareStatement(" select * from employee where employee.ename=?");
		System.out.println("Enter Username:");
		
		st.setString(1,sc.nextLine());
		
		ResultSet rs=st.executeQuery();
		if(rs.next()) {
			
				System.out.println(rs.getInt("id")+" "+rs.getString("ename")+" "+rs.getInt("salary")+" "+rs.getInt("deptid")+" "+rs.getString("designation"));
						
				
				
			
			
		}else {
			
			// JOptionPane.showMessageDialog(null,"User not found!");
			System.out.println("user not found");
		}
		
		
	} catch (SQLException e) {
		
	System.out.println(e.getMessage());
	}

}
}
