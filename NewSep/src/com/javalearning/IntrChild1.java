package com.javalearning;

public class IntrChild1 implements ParentInterface {
	

	@Override
	public void extendParentPublicMethod(String name) {
		System.out.printf("Hi %s, this is Child1 public method \n", name);
	}

	@Override
	public void extendParentProtectedMethod(String name) {
		System.out.printf("Hi %s, this is Child1 overwritten method \n", name);
	}

}
