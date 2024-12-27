package com.nareshit.D_java_support_concepts.J_working_with_generics;

import java.util.ArrayList;

class Car{
	
}

public class MixingGenericsWithNonGenericsProgram01 {

	public static void main(String[] args) 
	{
		ArrayList<Car> a = new ArrayList<>();
		a.add(new Car());
		a.add(new Car());
	    a.add(new Car());

		ArrayList b = a;  //assigning Generic to raw type
	    System.out.println(b);   
	}

}
