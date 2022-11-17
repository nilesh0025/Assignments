package com.Collection_Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class List_of_String_in_Decending {

	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("amrapali");
		l.add("neha");
		l.add("nikhil");
		l.add("nilesh");
		l.add("neha");
		l.add("amrapali");
		l.add("brijesh");
		
		List<String> list=l.stream()
			      .distinct()
			      .collect(Collectors.toList());
		System.out.println("duplicates removed"+list);
		Collections.sort(list);
		
		System.out.println(list);
		
		//System.out.print(Collections.sort(list));

	}

}
