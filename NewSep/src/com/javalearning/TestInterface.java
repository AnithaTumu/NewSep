package com.javalearning;

public class TestInterface {

	public void interdemo(ParentInterface p) {
		p.extendParentProtectedMethod("Cookoo");
	}

	public static void main(String[] args) {
		IntrChild1 ch1 = new IntrChild1();
		IntrChild2 ch2 = new IntrChild2();
		IntrChil3 ch3 = new IntrChil3();
		ch1.extendParentProtectedMethod("Me");
		ch1.extendParentPublicMethod("Maya");
		ch3.child3Method("Nyna");
		TestInterface th = new TestInterface();
		th.interdemo(ch3);
		th.interdemo(ch2);
		th.interdemo(ch1);
	}

}
