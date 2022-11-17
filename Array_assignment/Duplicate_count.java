package Array_assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicate_count {
	
	public static void Dupicate() {
		int a[]= {8,8,8,2,3,4,5,5};
		int b[]=a;
				int count=0,i,j;
		for( i=0;i<b.length;i++) {
			count=1;
			for(j=i+1  ;j<b.length;j++) {
			if(b[i]!=-1) {
				if(b[i]==b[j]) {
                b[j] =-1;
				count++	;
				
				}}
//			if(count>1) {
//				
//				System.out.println(a[i]+"= "+count);
		}
				if(count>1) {
			
			System.out.println(a[i]+"= "+count);
				
		}		}
				
	}
				
					
				
				
				
				
				
				
							
					
				
		
			
						
					
				
			
	
//		int a[]= {8,9,4,4,2,8,1,9};
//		int temp=0;
//		for(int i=0;i<a.length;i++) {
//			int count=1;
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j]) {
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//					//count++;
//					
//					System.out.println(a[i]);
//					//break;
//				
//					
//					}if(a[i]==a[j]) {
//						count=count+1;
//					
//						break;
//						
//					}else if(count >1) {
//					System.out.print(a[i]+" "+count);
//				}
//		}}
		
		
//		Scanner sc =new Scanner(System.in);
//	    System.out.println("Enter String name to find Duplicate");
//	    String str=sc.next();
//	
//	      int count = 0;
//	      char[] input = str.toCharArray();
//	      System.out.println("Duplicate Characters are:");
//	      for (int i = 0; i < str.length(); i++) {
//	       for (int j = i + 1; j < str.length(); j++) {
//	        if (input[i] == input[j]) {
//	         System.out.println("Duplicate Charrector from "+str+" is = "+input[j]);
//	         count++;
//	         break;}
//	        System.out.println(count);
//	       }}}
	public static void main(String[] args) {
		
		Duplicate_count.Dupicate();
		
		
	}

}
