package com.nareshit.D_java_support_concepts.G_enum_in_java;

public class EnumProgram05 {

	private enum Season   //private, public, protected, static
	{
		SPRING, SUMMER, WINTER, RAINY;
	}

	public static void main(String[] args) 
	{
		System.out.println(Season.RAINY);
	}


}
