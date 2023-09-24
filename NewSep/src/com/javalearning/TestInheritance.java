package com.javalearning;

public class TestInheritance {


	public static void main(String[] args) {
		Parent parentClass = new Parent();
		Child1 child1Class = new Child1();
		Child2 child2Class = new Child2();
		Child3 child3Class = new Child3();
		
		parentClass.extendParentProtectedMethod("Anitha");
		parentClass.extendParentPublicMethod("Anitha");
		//parentClass. -- we cannot see the private class to invoke.
		System.out.println("**********************************");
		child1Class.childMethod("anitha");
		child1Class.extendParentProtectedMethod("anitha");
		child1Class.extendParentPublicMethod("anitha");
		System.out.println("**********************************");
		child2Class.child2Method("ANITHA");
		child2Class.extendParentProtectedMethod("ANITHA");
		child2Class.extendParentPublicMethod("ANITHA");
		System.out.println("**********************************");
		child3Class.child3Method("ANU");
		child3Class.extendParentProtectedMethod("ANU");
		child3Class.extendParentPublicMethod("ANU");
		System.out.println("**********************************");
	}

}
