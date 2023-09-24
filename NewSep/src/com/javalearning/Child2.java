package com.javalearning;

public class Child2 extends Parent {

	public void child2Method(String name) {
		System.out.printf("Hi %s, this is Child2 method \n", name);
	}
	
	public void extendParentPublicMethod(String name) {
		System.out.printf("Hi %s, this is Child2 public method \n", name);
	}

}
