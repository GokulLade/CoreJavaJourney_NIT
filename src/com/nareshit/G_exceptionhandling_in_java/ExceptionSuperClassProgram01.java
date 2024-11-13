package com.nareshit.G_exceptionhandling_in_java;

import java.io.FileNotFoundException;

//WAP that describes Exception is the super class of all the exceptions we have in java.
public class ExceptionSuperClassProgram01 {

	public static void main(String[] args) 
	{
		Exception e1=new ArithmeticException();
		System.out.println(e1);
		
		Exception e2=new FileNotFoundException();
		System.out.println(e2);

	}

}
