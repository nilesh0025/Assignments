package Array_assignment;

public class Lcm_Hcm {
       
	public static void Lcm(int a[]) {
		int	max=0;int min=0;int x,lcm=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					max=a[i];
				    min=a[j];	
				}else {
					max=a[j];
					min=a[i];
				}
				 for(int k =0; k<a.length; k++) {
		               x = k * max;
		               if(x % min == 0) {
		                  lcm = x ;
					 
				}
			}
			}}
		System.out.println(lcm);
	}
  public static void Hcf(int a[]) {
	  int hcf=0;	  
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int temp;
				int temp1 = a[i];
				int temp2 = a[j];

				while (temp2 != 0) {
					temp = temp2;
					temp2 = temp1 % temp2;
					temp1 = temp;
				}
				 hcf = temp1;
			
			
			}
			
		}
		System.out.println(hcf);
	  

  }
	public static void main(String[] args) {
		int a[]= {2,4,6,8,10};
		Lcm_Hcm.Lcm(a);
		
		Lcm_Hcm.Hcf(a);
	}

}
