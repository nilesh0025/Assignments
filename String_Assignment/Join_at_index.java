package com.String_Assignment;

public class Join_at_index {

	public static String A(String s,String n, int ind){
	      
	  
	        // Create a new string 
	        String newString = new String(); 
	  
	        for (int i = 0; i < s.length(); i++) { 
	  
	            // Insert the original string character 
	            // into the new string 
	            newString += s.charAt(i); 
	  
	            if (i == ind) { 
	  
	                // Insert the string to be inserted 
	                // into the new string 
	                newString += n; 
	            } 
	        } 
	  
	        // return the modified String 
	        return newString; 
	    } 
	  
	    // Driver code 
	    public static void main(String[] args) 
	    { 
	  
	        // Get the Strings 
	        String s = "nilesh"; 
	        String n = "For"; 
	        int ind = 4; 
	  
//	        System.out.println("Original String: "
//	                           + originalString); 
	        System.out.println("index: "
                    + ind); 
	        System.out.println("new String: "
	                           + n); 
//	        System.out.println("String to be inserted at index: "
//	                           + index); 
	  
	        // Insert the String 
	        System.out.println("Modified String: "
	                           + A(s, 
	                                          n, 
	                                          ind)); 
	    } 

	}


