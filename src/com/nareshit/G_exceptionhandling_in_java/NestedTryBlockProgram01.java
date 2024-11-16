package com.nareshit.G_exceptionhandling_in_java;

public class NestedTryBlockProgram01 {

	public static void main(String[] args) 
	{
		try {
			
			String str="null";
			System.out.println(str.toUpperCase());
			
			try {
				System.out.println(10/0);
			}
			catch(ArithmeticException ae)
			{
				System.out.println(ae);
			}
		}
		catch(NullPointerException ne)
		{
			System.out.println(ne);
		}

	}

}
