package com.javalearning;

public class Child1 extends Parent {

	public void childMethod(String name) {
		System.out.printf("Hi %s, this is Child1 method \n", name);
	}
	
	public void extendParentPublicMethod(String name) {
		System.out.printf("Hi %s, this is Child1 public method \n", name);
	}
			
	protected void extendParentProtectedMethod(String name) {
		System.out.printf("Hi %s, this is Child1 protected method \n", name);
	}

}
