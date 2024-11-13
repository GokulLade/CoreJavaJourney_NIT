package com.nareshit.G_exceptionhandling_in_java;

public class ThrowExceptionFromTryBlockProgram01 {

	public static void main(String[] args) 
	{
		try {
			throw new ArithmeticException("Divided by Zero");
		}
		catch(Exception e)
		{
			System.err.println(e);
		}

	}

}
