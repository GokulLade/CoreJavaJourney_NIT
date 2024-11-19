package com.nareshit.G_exceptionhandling_in_java;

public class ExceptionPropagationProgram01 {

	public static void main(String[] args) 
	{
		System.out.println("Main method start");
		try {
			m1();
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}
	
		System.out.println("Main method stoped");
	}
	
	public static void m1()
	{
		System.out.println("M1 method start");
		m2();
		System.out.println("M1 method stoped");
	}
	public static void m2()
	{
		System.out.println(10/0);
	}

}
