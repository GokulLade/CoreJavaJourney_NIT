package com.nareshit.G_exceptionhandling_in_java;

public class ThrowsKeywordProgram01 {

	public static void main(String[] args) 
	{
		try {
			display();
		}
		catch(Exception ae)
		{
			System.out.println(ae);
		}
		

	}
	
	public static void display() throws ArrayIndexOutOfBoundsException 
	{
		int arr[]= {10,20,30};
		System.out.println(arr[3]);
	}

}
