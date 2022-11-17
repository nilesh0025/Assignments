package com.Lamda_Assignment;

import java.util.Scanner;
interface pall{
	public void pallend();
}

public class pallendrome {

	public static void main(String[] args) {
		pall p=()->{try {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to check Palindrome:");
		a=sc.nextInt();
		StringBuilder s=new StringBuilder(String.valueOf(a));
		StringBuilder s1=s.reverse();
		//System.out.println(s);
		String b=s1.toString();
		if(a== Integer.parseInt(b)) {
			
		System.out.println(a+" = Number is Palindrome");
		}
		else {
			System.out.println(a+" = Number is not Palindrome");
		}
		
	
	}catch(Exception e) {
		System.out.println("Please Enter Valid Number");
	}
	};
	p.pallend();
}}
