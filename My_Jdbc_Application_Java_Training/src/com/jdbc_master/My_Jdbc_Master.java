package com.jdbc_master;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class My_Jdbc_Master {
	 static String URL="jdbc:mysql://localhost:3306/jdbc_master";
	   static String USERNAME="root";
	   static String PASSWORD="root";
	   
	   public static void main(String[] args) {
	        try {
	            Scanner sc = new Scanner(System.in);
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
	            PreparedStatement pst = conn.prepareStatement("insert into employee(id , ename , salary , deptid , designation) values(?,?,?,?,?)");
	            System.out.println("please enter id");
	            pst.setInt(1, Integer.parseInt(sc.nextLine()));
	            System.out.println("please enter employee name");
	            pst.setString(2, sc.nextLine());
	            System.out.println("please enter employee salary");
	            pst.setInt(3, Integer.parseInt(sc.nextLine()));
	            System.out.println("please enter employee deptid");
	            pst.setInt(4, Integer.parseInt(sc.nextLine()));
	            System.out.println("please enter employee designation");
	            pst.setString(5, sc.nextLine());
	            
	            //execute the update
	           int i= pst.executeUpdate();
	           if(i==1) {
	           System.out.println("inserted Successfully");}
	            
	            //close the connection
	            conn.close();
	        }catch(Exception ex) {
	            System.out.println(ex.getMessage());
	        }
	}
	}

	
//	static String URL="jdbc:mysql://localhost3306/jdbc_master";
//	static String USERNAME="root";
//	static String PASSWORD="root";
//	
//
//	public static void main(String[] args) {
//		try {
//			
//			Scanner sc=new Scanner(System.in);
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
//			PreparedStatement pst=con.prepareStatement("insert into employee(id,ename,salary,deptid,designation) values(?,?,?,?,?)");
//			pst.setInt(1, Integer.parseInt(sc.nextLine()));
//			pst.setString(2, sc.nextLine());
//			pst.setInt(3, Integer.parseInt(sc.nextLine()));
//			pst.setInt(4, Integer.parseInt(sc.nextLine()));
//			pst.setString(5, sc.nextLine());
//			pst.executeUpdate();
//			con.close();
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//	}
//
//}
