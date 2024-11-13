package com.nareshit.G_exceptionhandling_in_java;

//Exception format : Fully Qualified Name : errorMessage
public class ExceptionFormatProgram01 {

	public static void main(String[] args) 
	{
		ArithmeticException ae= new ArithmeticException("Divided by Zero");
		
		System.out.println(ae);

	}

}
