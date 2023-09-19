package com.javalearning;

public class PassByValue {

	private int a;
	
	
	public void passByValue(int v)
	{
		//Method1
		System.out.println("Initial Value of a: " + v);
		v = v+10;
		System.out.println("Final Value of a: " + v);
	}
	
	public void passByReference(PassByValue ref)
	{
		//Method2
		System.out.println("hashcode: " + ref.hashCode());
		System.out.println("Initial Value of a: " + ref.a);
		ref.a = ref.a+10;
		System.out.println("Final Value of a: " + ref.a);
	}

	public static void main(String[] args) {
		PassByValue passByValue = new PassByValue();
		passByValue.a = 20;
		System.out.println("Before passByValue method a: " + passByValue.a);
		System.out.println("hashcode: " + passByValue.hashCode());
		passByValue.passByValue(passByValue.a);
		System.out.println("After passByValue method of a: " + passByValue.a);	
		
		System.out.println("Before passByReference method a: " + passByValue.a);
		System.out.println("hashcode: " + passByValue.hashCode());
		passByValue.passByReference(passByValue);
		System.out.println("After passByReference method of a: " + passByValue.a);	

	}

}
