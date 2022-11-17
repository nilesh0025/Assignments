package Array_assignment;

public class String_Array_Acending {

	public static void main(String[] args) {
		  String s[]= {"java","php","python","c","html","spring","reactjs"};
		     System.out.println("arrange string  on the basis of the length are  : ");
		     for(int i=0;i<s.length;i++)
		     {
		    	 for(int j=i+1;j<s.length;j++)
		    	 {
		    		 if(s[i].length()>s[j].length())
		    		 {
		    			 String temp=s[i];
		    			 s[i]=s[j];
		    			 s[j]=temp;
		    		 }
		    	 }
		    	 System.out.print(" "+s[i]);
		     }
			}}