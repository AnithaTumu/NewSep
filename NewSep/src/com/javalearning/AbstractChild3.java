package com.javalearning;

public class AbstractChild3 extends Parentabstract {

	public void child3Method(String name) {
		System.out.printf("Hi %s, this is Child3 method \n", name);
	}
	
	public void extendParentPublicMethod(String name) {
		super.extendParentProtectedMethod(name);
		System.out.printf("Hi %s, this is Child3 public method \n", name);
	}

}
