package com.Assignment;

public class Complex {

	
		
		 double d;
		    double e;



		   public Complex(double d, double e) {
			   this.d = d;
		        this.e = e;
			}




		   public static void main(String[] args) {
		        
		        Complex n1 = new Complex(2.3, 4.5);
		               Complex n2 = new Complex(3.4, 5.0);
		               Complex a;



		       a = add(n1, n2);



		       System.out.printf("Sum = %.1f + %.1fi", a.d, a.e);
		    }



		   public static Complex add(Complex n1, Complex n2)
		    {
		        Complex a = new Complex(0.0, 0.0);



		       a.d = n1.d + n2.d;
		        a.e = n1.e + n2.e;



		       return(a);
		    }

	}


