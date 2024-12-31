package com.nareshit.D_java_support_concepts.J_working_with_generics;


public class GenericsWithMethodProgram01
{
	public static void main(String[] args) 
	{
		Integer []intArr = {10,20,30,40,50};
		printArray(intArr);
		
		System.out.println(".............");
		
		String []cities = {"Hyderabad", "Banglore", "Mumbai", "Kolkata"};
		printArray(cities);
		
	}
	
	public static <T> void printArray(T[] array)
	{
		for(T element : array )
		{
			System.out.println(element);
		}
	}

}
