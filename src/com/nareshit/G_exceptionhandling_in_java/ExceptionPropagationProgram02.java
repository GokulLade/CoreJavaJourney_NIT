package com.nareshit.G_exceptionhandling_in_java;

import java.io.IOException;

public class ExceptionPropagationProgram02 {

	public static void main(String[] args) 
	{

		m3();
		try {
			
			m1();
			m2();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	//Exception
	public static void m1() throws Exception
	{
		throw new Exception();
	}
	
	//Checked Exception
	public static void m2() throws IOException
	{
		throw new IOException();
	}
	
	//Un-checked Exception
	public static void m3()
	{
		throw new ArithmeticException();
	}
}
