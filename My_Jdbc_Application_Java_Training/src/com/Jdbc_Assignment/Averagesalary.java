package com.Jdbc_Assignment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.jdbc_master.Connection_Master;

public class Averagesalary {
public static void main(String[] args) {
	try {
		Connection conn = Connection_Master.getConnection();

		Scanner sc = new Scanner(System.in);

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(" SELECT  gender,avg(salary) as avg FROM employee GROUP BY employee.gender");
		System.out.println("Average Salary by Gender:");
		System.out.println("Average" + "   " + "Gender" );
		System.out.println("-------------------------------");
		while (rs.next()) {
			System.out.println(
					rs.getInt("avg") + "       "  + rs.getString("gender"));

		}

	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
