package Array_assignment;

public class Even_odd_prime_Array {

	public static void Odd_Even(int a[]) {
		int counteven = 0;
		int countodd = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				counteven++;
			} else {
				countodd++;
			}
		}
		System.out.println("Total Even Numbers:" + counteven);
		System.out.println("Total Odd Numbers:" + countodd);

	}

	public static void prime(int a[]) {
		int countprime = 0;

		int i, j, m = 0;
		for (i = 0; i < a.length; i++) {
			int flag = 0;
			m = a[i] / 2;
			
			if (a[i] <= 1) {
				flag = 1;

			} else {
				for (j = 2; j <= m; j++) {
					if (a[i] % j == 0) {
						flag = 1;

					}
				}
				if (flag == 0) {
					countprime++;
				}
			}

		}
		System.out.println("Total Prime Numbers:" + countprime);

	}
public static void perfect(int a[]) {
	int countperfect=0;
	for (int i = 0; i < a.length; i++) {
		int sum=0;
		int no=1;
		while(no <= a[i]/2)  
		{  
		if(a[i] % no == 0)  
		{  
			sum = sum + no;  
		}no++;
		}if(sum==a[i])  
		{  
			countperfect++;
		}
		
	}System.out.println("Total Perfect Numbers :"+countperfect);
}
	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 5, 6,11, 7,28, 8, 90, 44 };
		Even_odd_prime_Array.Odd_Even(a);
		Even_odd_prime_Array.perfect(a);
		Even_odd_prime_Array.prime(a);
	}

}
