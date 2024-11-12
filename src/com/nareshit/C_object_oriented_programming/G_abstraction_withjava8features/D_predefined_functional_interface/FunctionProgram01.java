package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.D_predefined_functional_interface;

import java.util.function.Function;

public class FunctionProgram01 {

	public static void main(String[] args) 
	{
		// Finding the String start with user string or not
		
		String s="Gokul";
		
		Function<String,Boolean> findStartWith=str-> str.startsWith(s);
		
		if(findStartWith.apply("Gokul Subhash Lade")) 
		{
			System.out.println("String start with "+s);
		}
		else
		{
			System.out.println("String Not start with "+s);
		}

	}

}
