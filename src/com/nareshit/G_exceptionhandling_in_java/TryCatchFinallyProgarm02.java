package com.nareshit.G_exceptionhandling_in_java;

public class TryCatchFinallyProgarm02 {

	public static void main(String[] args) 
	{
		System.out.println("Main method Start");
		
		try
		{
			int arr[]=new int[-20];
			System.out.println(arr[2]);
		}
		catch(NegativeArraySizeException ne)
		{
			System.out.println(ne);
		}
		finally
		{
			System.out.println("In Finally..");
		}

		System.out.println("Main method End");
	}

}
