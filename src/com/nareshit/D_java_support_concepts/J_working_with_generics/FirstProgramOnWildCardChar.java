package com.nareshit.D_java_support_concepts.J_working_with_generics;

import java.util.ArrayList;
import java.util.List;

class Parent
{

}
class Child extends Parent
{
}

public class FirstProgramOnWildCardChar {

	public static void main(String[] args)
	{
		
		List<?> lp = new ArrayList<Parent>(); 
		System.out.println("Wild card....");
	
	}

}
