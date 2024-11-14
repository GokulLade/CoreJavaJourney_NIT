package com.nareshit.G_exceptionhandling_in_java;

import java.util.InputMismatchException;

public class MultyCatchProgram02 {

	public static void main(String[] args) 
	{
		
		System.out.println("Main Method Start");
		
		try {
			String str=null;
			System.out.println(str.toLowerCase());
			System.out.println(10/0);
		}
		catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException | InputMismatchException e)
		{
			if(e instanceof ArithmeticException)
			{
				System.out.println("Divided By Zero");
			}
			else if(e instanceof NullPointerException)
			{
				System.out.println("Object is refering Null value");
			}
			else if(e instanceof ArrayIndexOutOfBoundsException)
			{
				System.out.println("Array Size is Not in Limit");
			}
			else if(e instanceof InputMismatchException)
			{
				System.out.println("Please Enter the Valid Input");
			}
		}
		
		System.out.println("Main Method End");
	}

}
