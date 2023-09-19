package com.javalearning;

public class PassByValue {

	private int a;
	
	
	public void passByValue(int v)
	{
		System.out.println("Initial Value of a: " + v);
		v = v+10;
		System.out.println("Final Value of a: " + v);
	}
	
	public void passByReference(PassByValue ref)
	{
		System.out.println("Initial Value of a: " + ref.a);
		ref.a = ref.a+10;
		System.out.println("Final Value of a: " + ref.a);
	}

	public static void main(String[] args) {
		PassByValue passByValue = new PassByValue();
		passByValue.a = 20;
		System.out.println("Before passByValue method a: " + passByValue.a);
		passByValue.passByValue(passByValue.a);
		System.out.println("After passByValue method of a: " + passByValue.a);	
		
		System.out.println("Before passByReference method a: " + passByValue.a);
		passByValue.passByReference(passByValue);
		System.out.println("After passByReference method of a: " + passByValue.a);	

	}

}
