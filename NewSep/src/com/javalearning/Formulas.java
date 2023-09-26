package com.javalearning;

public class Formulas {

	//Method for factorial
	private int nFactorial(int n)
	{
		if(n < 1)
			return 0;
		int fac = 1;
		
		for(int i=n;i>=1;i--)
		{
			fac = fac * i;			
		}
		return fac;
	}
	
	//Recursive way of factorial
	private int recFac(int n)
	{
		if(n<1)
		{return 0;}
		else if (n==1)
		{ return 1;}
		else {
			return n*recFac(n-1);
		}
	}
	
	//Method for n+10
	private int nPlus10(int n)
	{				
		return n+10;
	}
	
	//Method for Formula n*(n+10)*n!
	public void formula1(int n)
	{				
			n = n * nPlus10(n) * nFactorial(n);
			System.out.printf("Result of first formula n*(n+10)*n! is %d \n", n);
	}
	
	//Method for Formula n+(n+10)+n!
	public void formula2(int n)
	{
		n = n + nPlus10(n) + recFac(n);
			System.out.printf("Result of second formula n+(n+10)+n! is %d \n", n);
	}

	public static void main(String[] args)
	{
		Formulas f = new Formulas();
		f.formula1(-10);
		f.formula2(-10);
	}
}
