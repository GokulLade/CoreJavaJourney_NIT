package com.nareshit.G_exceptionhandling_in_java;

class Test{
	
	public Test(String msg)
	{
		System.out.println(msg);
	}
	
	
	//Instance block
	
	{
		//throw new ArithmeticException(); //Invalid
		
		try {
			throw new ArithmeticException();
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
	}
	
	
}

public class ExceptionIninitializersProgram01{

	
	public static void main(String[] args) 
	{
		new Test("Hello");
		
	}
	
	

}
