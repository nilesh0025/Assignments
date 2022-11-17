package com.String_Assignment;

public class Remove_vovel {
	
	
	public static void vow() {
		char r=0;
		
		char nonvowel;
		
		String s="aeiounilesh";
		
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				//r=ch[i];
			}else {
//				nonvowel=ch[i];
				System.out.print(ch[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		Remove_vovel.vow();
	}

}
