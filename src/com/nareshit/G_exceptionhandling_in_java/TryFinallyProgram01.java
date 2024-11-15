package com.nareshit.G_exceptionhandling_in_java;

public class TryFinallyProgram01 {

	public static void main(String[] args) 
	{
		System.out.println("Main methods Start...");
		
		try {
			System.out.println(10/0);
		}
		finally {
			System.out.println("In finally block");
		}
		
		System.out.println("Main methods End...");
	}

}
