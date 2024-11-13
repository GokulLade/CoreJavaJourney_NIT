package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.D_predefined_functional_interface;

import java.util.function.BiFunction;

public class BiFunctionProgram01 {

	public static void main(String[] args) 
	{
		
		BiFunction<String, String, String> concatString=(str1,str2)->(str1+str2);
		
		String str="Gokul ";
		String result=concatString.apply(str,"Lade");
		System.out.println(result);

		BiFunction<String, String, Integer> concatStringLength=(str1,str2)->(str1.length()+str2.length());
		
		System.out.println("The Length of String is : "+concatStringLength.apply("Hello"," Java"));
	}

}
