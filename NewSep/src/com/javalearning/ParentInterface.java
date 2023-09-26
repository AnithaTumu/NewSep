package com.javalearning;

public interface ParentInterface {

	public void extendParentPublicMethod(String name); 
			
	public void extendParentProtectedMethod(String name);
	
	private void parentMethod(String name) {
		System.out.println("******************");
	}

}
