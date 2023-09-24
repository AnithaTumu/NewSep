package com.javalearning;

public class Formulas {

	
	public void form1(int n)
	{
		int fac = 1;
		
		for(int i=n;i>=1;i--)
		{
			fac = fac * i;			
		}
		
		System.out.printf("factorial is %d \n", fac);	
			n = n * (n+10) * fac;
			System.out.printf("Result of first formula n*(n+10)*n! is %d \n", n);
	}
	
	public void form2(int n)
	{
		
		int fac = 1;
		for(int i=n;i>=1;i--)
		{
			fac = fac * i;
		}
		System.out.printf("factorial is %d \n", fac);	
			n = n + (n+10) + fac;
			System.out.printf("Result of second formula n+(n+10)+n! is %d \n", n);
	}

	public static void main(String[] args)
	{
		Formulas f = new Formulas();
		f.form1(10);
		f.form2(10);
	}
}
