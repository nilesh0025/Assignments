package com.Collection_Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Binary_Search {

	public static void main(String[] args) {
		
		List<Integer> f=new ArrayList<Integer>();
		
//		f.add("apple");
//		f.add("banana");
//		f.add("papaya");
//		f.add("mango");
//		
		f.add(20);
		f.add(30);
		f.add(10);
		f.add(90);
		
		Collections.sort(f);
		System.out.println(Collections.binarySearch(f, 90));
	}

}
