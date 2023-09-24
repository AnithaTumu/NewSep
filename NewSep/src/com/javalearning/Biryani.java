package com.javalearning;

public class Biryani {

	public enum Type
	{
		Chicken,
		Mutton,
		Fish
	}
	private Type type;
	private String name;
	
	public String getName() 
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public Type getType() {
		return this.type;
	}
	
	public void setType(Type type)
	{
		this.type = type;
	}
	
	public void make()
	{
		System.out.printf("Making %s with %s \n", this.name, this.type);
	}
}
