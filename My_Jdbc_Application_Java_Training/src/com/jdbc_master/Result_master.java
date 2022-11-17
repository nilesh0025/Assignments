package com.jdbc_master;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Result_master {
public static void main(String[] args) {
	try {
		Connection conn=Connection_Master.getConnection();
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from employee");
		while(rs.next()) {
			System.out.println(rs.getInt("id")+" "+rs.getString("ename")+" "+rs.getInt("salary")+" "+rs.getInt("deptid")+" "+rs.getString("designation"));
		}
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
