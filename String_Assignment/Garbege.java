package com.String_Assignment;

public class Garbege {
	  public void m1() {
	        String s = "swapnil mule";
	        System.out.println(s);
	    }
	    public void finalize() {
	        System.out.println("this is garbage collector");
	    }

	public static void main(String[] args) {
		
		  
		Garbege str1 = new Garbege();
		        
		       
		        str1=null;
		        System.gc();
		    }
	}


