package com.javalearning;
import com.javalearning.Biryani.Type;
public class TestClass {

	public static void main(String[] args) {
		Biryani chickenBiryani = new Biryani();
		Biryani muttonBiryani = new Biryani();
		Biryani fishBiryani = new Biryani();
		
		chickenBiryani.setName("Chicken Dum Biryani");
		chickenBiryani.setType(Type.Chicken);
		muttonBiryani.setName("Mutton Dum Biryani");
		muttonBiryani.setType(Type.Mutton);
		fishBiryani.setName("Fish Biryani");
		fishBiryani.setType(Type.Fish);
		
		chickenBiryani.make();
		muttonBiryani.make();
		fishBiryani.make();
		
		StaticBiryani chbir = new StaticBiryani();
		StaticBiryani mubir = new StaticBiryani();
		StaticBiryani fbir = new StaticBiryani();
		
		StaticBiryani.type = "Non-Veg";
		StaticBiryani.name = "Special Biryani";
		chbir.setTemp("25C");
		mubir.setTemp("35C");
		fbir.setTemp("45C");
		
		chbir.make(); // this as good as StaticBiryani.make();
		chbir.temppref();
		mubir.make();
		mubir.temppref();
		fbir.make();
		fbir.temppref();
		
		//when we use static it's specific to class not object.
		
		
	}

}
