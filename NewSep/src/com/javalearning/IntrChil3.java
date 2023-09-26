package com.javalearning;

public class IntrChil3 implements ParentInterface {

	
	@Override
	public void extendParentPublicMethod(String name) {
		System.out.printf("Hi %s, this is Child3 public method \n", name);
		
	}

	@Override
	public void extendParentProtectedMethod(String name) {
		System.out.printf("Hi %s, this is Child3 overwritten method \n", name);
		
	}

	public void child3Method(String name)
	{
		System.out.printf("Hi %s, this is exclusive child3 method \n", name);
	}
}
