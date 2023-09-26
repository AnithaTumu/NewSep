package com.javalearning;

public class AbstractChild2 extends Parentabstract{

	public void child2Method(String name) {
		System.out.printf("Hi %s, this is Child2 method \n", name);
	}
	
	public void extendParentPublicMethod(String name) {
		System.out.printf("Hi %s, this is Child2 public method \n", name);
	}

}
