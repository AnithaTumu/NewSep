package com.javalearning;

public class StaticBiryani {

	public static String name;
	public static String type;
	private String temp;
	
	public void setTemp(String temp)
	{
		this.temp = temp;
	}
	public String getTemp()
	{
		return this.temp;
	}
	
	public static void make()
	{
		System.out.printf("Make %s using %s ", name, type);
	}
	
	public void temppref()
	{
		System.out.printf("at temparature %s \n", this.temp);
	}

}
