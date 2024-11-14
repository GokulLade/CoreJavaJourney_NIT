package com.nareshit.G_exceptionhandling_in_java;

public class ThrowableClassMethodProgram01 {

	public static void main(String[] args) 
	{
		System.out.println("Main method Start");
		try {
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println("--------getMessage method-------------");
			System.out.println(e.getMessage());
			
			System.out.println("--------printStackTrace method-------------");
			e.printStackTrace();
			
			System.out.println("--------toString() method-------------");
			System.out.println(e.toString());
		}
		
		System.out.println("Main method End");
	}

}
