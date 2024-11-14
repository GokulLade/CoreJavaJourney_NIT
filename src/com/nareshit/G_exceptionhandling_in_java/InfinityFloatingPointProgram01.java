package com.nareshit.G_exceptionhandling_in_java;

public class InfinityFloatingPointProgram01 {

	public static void main(String[] args) 
	{
		System.out.println("Main Method Start..!");
		
		System.out.println(10/0.0); //infinity
		System.out.println(-10/0.0); //-infinity
		System.out.println(10.0/0.0); //infinity
		System.out.println(0.0/0.0); //infinity
		
		
		try {
			System.out.println(0/0);//NaN
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divided By Zero ");
		}

		System.out.println("Main Method End..!");
	}

}
