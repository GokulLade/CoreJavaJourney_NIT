package com.nareshit.G_exceptionhandling_in_java;

public class VariableInitializationProgram01 {

	public static void main(String[] args) 
	{
		int x;
		
		try {
			x=300;
			System.out.println(x);
		}
		catch(Exception e)
		{
//			System.out.println(x); // Error
			x=400;
			System.out.println(x);
		}
	}

}
