package com.nareshit.G_exceptionhandling_in_java;

public class TryWithReturnProgram03 {
	
	public static void main(String[] args) 
	{
		System.out.println(returnValue());
	}

	
	public static int  returnValue()
	{
		try {
			return 10/0;
		}
		catch(Exception e)
		{
			return 20;
		}
		
	}

}
