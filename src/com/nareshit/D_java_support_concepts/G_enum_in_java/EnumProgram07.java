package com.nareshit.D_java_support_concepts.G_enum_in_java;

//All enums are by default final so can't inherit

enum Pizza
{
	SMALL, MEDIUM, BIG;
}
public class EnumProgram07
{
	public static void main(String[] args) 
	{
		System.out.println(Pizza.BIG);
	}
}

