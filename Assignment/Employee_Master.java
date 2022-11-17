package com.Assignment;

import java.util.Scanner;

public class Employee_Master {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter basic salary");
		float basicsalary=sc.nextFloat();
//		System.out.println("enter da");
//		float da=sc.nextFloat();
//		System.out.println("enter incometax");
//		float incometax=sc.nextFloat();
		
		Employee e=new Employee(id,name,basicsalary);
		System.out.println(e);
		
		System.out.println("net salary : "+e.netsalary());
		
	}

}
