package com.set;

import java.util.HashSet;
import java.util.Set;

public class CompanySet {

	public static void main(String[] args) {
		Set<String> java=new HashSet<String>();
		java.add("ram");
		java.add("shyam");
		java.add("amitabh");
		Set<String> react=new HashSet<String>();
		react.add("sachin");
		react.add("shyam");
		react.add("amitabh");
		react.add("jatin");
		Set<String> all=new HashSet<String>();
		all.add("sachin");
		all.add("shyam");
		all.add("amitabh");
		all.add("jatin");
		all.add("suresh");
		all.add("karan");
		all.add("ramesh");
		System.out.println(all.size());
		
		Set<String> union=new HashSet<String>();
		union.addAll(java);
		union.addAll(react);
		
		System.out.println(union.size());
		
		Set<String> javaButNotReact =new HashSet<String>();
		javaButNotReact.addAll(java);
		

		}

}