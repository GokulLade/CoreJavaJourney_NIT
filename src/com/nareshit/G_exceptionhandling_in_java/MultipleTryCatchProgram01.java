package com.nareshit.G_exceptionhandling_in_java;

import java.util.InputMismatchException;

public class MultipleTryCatchProgram01 {

	public static void main(String[] args) 
	{
		try{
			System.out.println(10/0);
		}
		catch(ArithmeticException e1)
		{
			System.err.println(e1);
		}
		
		try{
				int arr[]= {10,20,30};
				System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.err.println(e2);
		}
		
		try{
			String str=null;
			System.out.println(str.toUpperCase());
		}
		catch(NullPointerException e3)
		{
			System.err.println(e3);
		}
	}

}
