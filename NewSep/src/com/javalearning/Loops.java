package com.javalearning;

public class Loops {

	private void whileLoop()
	{
		int x =1;
		while(x<5)
		{
			System.out.printf("The value of x is %d \n", x);
			x++;
		}
	}
	
	private void forLoop()
	{
		//Method1:
		for(int x =1;x<5;x++)
		{
			System.out.printf("The value of x is %d \n", x);			
		}
		//Method2:
		int y=2;
		for(;y<9;)
		{
			System.out.printf("The value of y is %d \n", y);	
			y++;
		}
	}
	
	private void enhancedForLoop()
	{
		//Method1: you can iterate the loop based on your logic ex: i+2 or i+3 etc
		String[] weekDay = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
		
		for(int i =0;i<weekDay.length;i++)
		{
			System.out.printf("The value of weekDay[%d] is %s \n", i, weekDay[i]);			
		}
		//Method2: Will iterate through all elements of array from start to end no custom iteration possible
		
		for(String day:weekDay)
		{
			System.out.printf("The value of weekDay is %s \n", day);	
		}
	}
	
	public static void main(String[] args) {
		Loops loop = new Loops();
		loop.whileLoop();
		loop.forLoop();
		loop.enhancedForLoop();

	}

}
