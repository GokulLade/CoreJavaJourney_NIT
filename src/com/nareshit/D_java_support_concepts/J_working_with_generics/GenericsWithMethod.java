package com.nareshit.D_java_support_concepts.J_working_with_generics;

import java.util.ArrayList;
import java.util.List;

class Dog{
	
	public List<Dog> getObject()
	{
		List<Dog> dogs=new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		dogs.add(new Dog());
		
		return dogs;
	}
}

public class GenericsWithMethod {

	public static void main(String[] args) 
	{
		Dog d1=new Dog();
		Dog d2=d1.getObject().get(0);
		
		System.out.println(d2);

	}

}
