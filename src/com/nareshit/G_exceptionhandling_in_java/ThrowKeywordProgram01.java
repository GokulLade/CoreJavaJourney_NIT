package com.nareshit.G_exceptionhandling_in_java;

public class ThrowKeywordProgram01 {

	public static void main(String[] args) 
	{
		try {
			
			throw new ArithmeticException("Divided by Zero");
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}

	}

}
