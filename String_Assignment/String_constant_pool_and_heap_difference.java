package com.String_Assignment;

public class String_constant_pool_and_heap_difference {

	public static void Constant_pool()
	 { 
	        String s1 = "abc"; 
	        String s2 = "abc"; 
	  
	        // Note that this == compares whether 
	        // s1 and s2 refer to same object or not 
	        if (s1 == s2) 
	           System.out.println("string in String constant pool is matching : Yes"); 
	        else
	           System.out.println("string in String constant pool is matching : No"); 
	    } 
	
public static void Heap_pool() {
	 String s1 = new String("abc"); 
     String s2 = new String("abc"); 

     // Note that this == compares whether 
     // s1 and s2 refer to same object or not 
     if (s1 == s2) 
        System.out.println("string in Heap is matching : Yes"); 
     else
        System.out.println("string in Heap is matching : No"); 
}
	
	
	public static void main(String[] args) {
		String_constant_pool_and_heap_difference.Constant_pool();
		String_constant_pool_and_heap_difference.Heap_pool();
		
	}
	
}
