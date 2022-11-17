package com.set;

import java.util.HashSet;
import java.util.Set;

public class SetMaster {

	public static void main(String[] args) {
		Set<Integer> s1=new HashSet<Integer>();
		s1.add(10);
		s1.add(30);
		s1.add(60);
		s1.add(90);
		s1.add(30);
		s1.add(40);
		Set<Integer> s2=new HashSet<Integer>();
		s2.add(10);
		s2.add(30);
		s2.add(60);
		s2.add(90);
		s2.add(30);
		s2.add(40);
		Set<Integer> union=new HashSet<Integer>();
		union.addAll(s1);
		union.addAll(s2);
		Set<Integer> intersection=new HashSet<Integer>();
		intersection.addAll(s1);
        intersection.retainAll(s2);
        System.out.println("the unions of sets :  ");
        for(Integer a:union)
        {
        	System.out.println(a);
        }
        System.out.println("the intersection of sets:  ");
        for(Integer a:intersection)
        {
        	System.out.println(a);
        }
        
        
	}
}
