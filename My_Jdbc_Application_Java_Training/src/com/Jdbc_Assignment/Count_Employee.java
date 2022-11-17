package com.Jdbc_Assignment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.jdbc_master.Connection_Master;

public class Count_Employee {

	public static void main(String[] args) {

		try {
			Connection conn = Connection_Master.getConnection();

			Scanner sc = new Scanner(System.in);

			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(" SELECT  department.deptid,department.dname,COUNT(*) as count FROM department join employee on employee.deptid=department.deptid GROUP BY department.deptid");
			System.out.println("Count" + "   " + "Department" + "   " + "Department id");
			System.out.println("-------------------------------");
			while (rs.next()) {
				System.out.println(
						rs.getInt("count") + "       " + rs.getString("dname") + "    " + rs.getString("deptid"));

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}