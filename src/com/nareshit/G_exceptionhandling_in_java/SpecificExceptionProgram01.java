package com.nareshit.G_exceptionhandling_in_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SpecificExceptionProgram01 {

	public static void main(String[] args) 
	{
		System.out.println("Main Method Started..");
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Please Enter Your Roll Number..");
			int rollNumber=sc.nextInt();
			System.out.println("Your Roll Number is : "+rollNumber);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please Enter the Numeric Value..!");
		}
		
		sc.close();
		System.out.println("Main Method End..");
	}

}
