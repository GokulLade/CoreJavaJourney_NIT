package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.D_predefined_functional_interface;

import java.util.function.Function;

public class FunctionProgram02 {

	public static void main(String[] args) 
	{
		int number=2;
		
		Function<Integer,Integer> findCube=n->(n*n*n);
		
		System.out.println("The cube of Number is "+ findCube.apply(number));

	}

}
