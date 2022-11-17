package com.Collection_Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Acending_Order {

	public static void main(String[] args) {
	int key=0;
		List<Integer> al=new ArrayList<Integer>();
		al.add(11);
		al.add(34);
		al.add(78);
		al.add(56);
		al.add(77);
		al.add(90);
		
		Collections.sort(al);
		System.out.println(al);
		
	
		
		}
		
		
		
		
		
//		int first=0;
//		int last=0;
//		int key1=11;
//		int mid = (first + last)/2;  
//		   while( first <= last ){  
//		     
//			if ( a[mid] <  key1 ){  
//		        first = mid + 1;     
//		      }else if ( a[mid]==(key1) ){  
//		        System.out.println("Element is found at index: " + mid);  
//		        break;  
//		      }else{  
//		         last = mid - 1;  
//		      }  
//		      mid = (first + last)/2;  
//		   }  
//		   if ( first > last ){  
//		      System.out.println("Element is not found!");  
//		   }  
		 }  
//		

	


