package com.jdbc_master;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Delete_Master {
public static void main(String[] args) {
	

	try {
		Scanner sc=new Scanner(System.in);
		Connection conn=Connection_Master.getConnection();
		PreparedStatement ps=conn.prepareStatement("delete from employee where id=?");
		System.out.println("enter id");
		ps.setInt(1, Integer.parseInt(sc.nextLine()));
		ps.executeUpdate();
		
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}}

