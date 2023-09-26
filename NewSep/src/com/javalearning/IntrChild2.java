package com.javalearning;

public class IntrChild2 implements ParentInterface {

	
	@Override
	public void extendParentPublicMethod(String name) {
		System.out.printf("Hi %s, this is Child2 public method \n", name);
		
	}

	@Override
	public void extendParentProtectedMethod(String name) {
		System.out.printf("Hi %s, this is Child2 overwritten method \n", name);
		
	}

}
