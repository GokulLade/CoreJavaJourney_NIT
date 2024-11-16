package com.nareshit.G_exceptionhandling_in_java;

public class TryWithReturnProgram02 {

	public static void main(String[] args) 
	{
		System.out.println(returnValue());
	}

	@SuppressWarnings("finally")
	public static int  returnValue()
	{
		try {
			return 10;
		}
		catch(Exception e)
		{
			return 20;
		}
		finally {
			return 30;
		}
	}
}
