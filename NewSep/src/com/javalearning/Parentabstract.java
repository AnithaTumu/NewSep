package com.javalearning;

public abstract class Parentabstract {

	public void extendParentPublicMethod(String name) {
		System.out.printf("Hi %s, this is Parent public method \n", name);
	}
			
	protected void extendParentProtectedMethod(String name) {
		System.out.printf("Hi %s, this is Parent protected method \n", name);
	}
	
	private void parentMethod(String name) {
		System.out.printf("Hi %s, this is Parent private method \n", name);
	}

}
