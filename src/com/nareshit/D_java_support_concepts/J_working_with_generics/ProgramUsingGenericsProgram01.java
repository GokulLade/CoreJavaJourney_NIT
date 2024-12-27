package com.nareshit.D_java_support_concepts.J_working_with_generics;

import java.util.ArrayList;

public class ProgramUsingGenericsProgram01 {

	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<>(); // Generic type
		al.add("Ravi");
		al.add("Ajay");
		al.add("Vijay");

		for (int i = 0; i < al.size(); i++) 
		{
			String name = al.get(i); // no type casting is required
			System.out.println(name.toUpperCase());
		}
		
	}

}
