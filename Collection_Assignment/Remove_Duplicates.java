package com.Collection_Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_Duplicates {

	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		
		a.add(8);
		a.add(3);
		a.add(5);
		a.add(11);
		a.add(1);
		a.add(11);
		a.add(1);
		a.add(8);
		
//		List<List<Integer>> a1=Arrays.asList(a);
		List<Integer> list=a.stream()
	      .distinct()
	      .collect(Collectors.toList());
		
		System.out.println("Duplicates removed from list :"+list);
		Collections.sort(list);
		System.out.println("list in acending order :"+list);

	}

}
