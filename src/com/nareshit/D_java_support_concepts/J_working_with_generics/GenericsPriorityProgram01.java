package com.nareshit.D_java_support_concepts.J_working_with_generics;

public class GenericsPriorityProgram01 {

	public static void main(String[] args) 
	{
		show(12);
		show("Ravi");
	}
	public static <T> void show(T element)
	{
		System.out.println("Generic :"+element);
	}
	
	public static <T> void show(String element)
	{
		System.out.println("String "+element);
	}

}
