package com.Lamda_Assignment;

interface pattern{
	  public void draw_pattern();
}

public class Patteren_By_Lamda {
	  public static void main(String[] args) {
	        pattern r = () -> {
	            String s = "ABCDEFEDCBA";
	            System.out.println(s);
	            System.out.println("Please enter char to remove from string=");
	            
	            int a = s.length() / 2;
	            for (int i = a; i >= 0; i--) {
	                char c = s.charAt(i);
	                char c1 = ' ';
	                s = s.replace(c, c1);
	                System.out.println(s);
	            }
	        };
	        r.draw_pattern();
	    }
	}

