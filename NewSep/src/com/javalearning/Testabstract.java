package com.javalearning;

public class Testabstract {

	//Parentabstract pa = new Parentabstract();
	
	
	public void abstractdemo(Parentabstract pa)
	{
		System.out.println("************");
		pa.extendParentPublicMethod("Anu");
		pa.extendParentProtectedMethod("Anitha");
		System.out.println("************");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChild1 achild1 = new AbstractChild1();
		AbstractChild2 achild2 = new AbstractChild2();
		AbstractChild3 achild3 = new AbstractChild3();
		Testabstract tesabs = new Testabstract();
		
		achild1.childMethod("Pandu");
		achild1.extendParentProtectedMethod("Pandu");
		achild1.extendParentPublicMethod("Pandu");
		
		achild2.child2Method("Pandu1");		
		achild2.extendParentProtectedMethod("Pandu1");
		achild2.extendParentPublicMethod("Pandu1");
		
		achild3.child3Method("Pandu2");
		achild3.extendParentProtectedMethod("Pandu2");
		achild3.extendParentPublicMethod("Pandu2");
		
		tesabs.abstractdemo(achild3);
		tesabs.abstractdemo(achild2);
		tesabs.abstractdemo(achild1);
		
		/*
		 * achild1.childMethod("Pandu"); achild2.child2Method("Anamika");
		 * achild3.child3Method("Tumu"); tesabs.abstractdemo(child1);
		 * tesabs.abstractdemo(child2); tesabs.abstractdemo(child3);
		 */
		
	}

}
