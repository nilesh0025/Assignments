package com.String_Assignment;

public class Alphabets_in_acendindg_and_decending {
	
	public static void Acending() {
		char temp = 0;
		String a="nilesh";
		
		char c[]=a.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<a.length();j++) {
				if(c[i]>c[j]) {
				temp=c[i];
				c[i]=c[j];
				c[j]=temp;
				
			}
			
		}
		
	}
		System.out.println(c);
	}
	
	
	public static void Decending(String s) {
		char temp = 0;
		String a="nilesh";
		
		char c[]=a.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<a.length();j++) {
				if(c[i]<c[j]) {
				temp=c[i];
				c[i]=c[j];
				c[j]=temp;
				
			}
			
		}
		
	}
		System.out.println(c);
		
		
	}

	public static void main(String[] args) {
		
		Alphabets_in_acendindg_and_decending.Acending();
		
		Alphabets_in_acendindg_and_decending.Decending("nilesh");
		
		
	
		
		

	}

}
