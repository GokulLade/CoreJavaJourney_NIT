package com.nareshit.G_exceptionhandling_in_java;

public class FinallyNotExecuteProgram03 {

	public static void main(String[] args) 
	{
		System.out.println("Main method Start");
		
		try
		{
			System.out.println(10/0.0);
			System.out.println(0/0);
			System.exit(0);
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("In Finally block");
		}

		System.out.println("Main method End");
	}

}
