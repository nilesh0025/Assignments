package Array_assignment;

public class Half_Array_in_Acending_half_in_Decendding {

	public static void main(String[] args) {
		int a[]= {9,1,2,3,4,5,6,7,8};
		int n=a.length;
		System.out.println("ascending and decending order is ");
		for(int i=0;i<n/2;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		System.out.print(a[i]+" ");
	}
			for(int i=0;i<n/2+1;i++)
			{
				for(int j=i;j<n;j++)
				{
					if(a[i]<a[j])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			System.out.print(a[i]+" ");
		}
	}
	
	}


