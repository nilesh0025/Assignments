package Array_assignment;

public class Two_D_Array {

	public static void main(String[] args) {
		   int n=3;
	        int a[][] = { { 1,2,3},
	        		        { 5,6,7}, 
	        		        { 9,6,8} };
	        for (int i = 0; i < n; i++) {
	        	System.out.println("");
	            for(int j=0;j<n;j++) {
	                if((i!=0  &&   j!=0)  &&  (i!=n-1  &&  j!=n-1)) {
	                    System.out.print("   ");
	                    continue;
	            	
            	}
	                System.out.print(a[i][j]+"  ");
	            }
	            System.out.println();
	        }
	    }
	

	}


