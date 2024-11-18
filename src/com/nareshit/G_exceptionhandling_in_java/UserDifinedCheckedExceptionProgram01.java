package com.nareshit.G_exceptionhandling_in_java;

import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception
{
	public InvalidAgeException()
	{
		
	}
	
	public InvalidAgeException(String errorMessage)
	{
		super(errorMessage);
	}
	
}

public class UserDifinedCheckedExceptionProgram01 {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		try(sc;)
		{
			System.out.println("Enter your Age");
			int age=sc.nextInt();
			
			if(age<18)
			{
				throw new InvalidAgeException("You are not allow for Vote");
			}
			else
			{
				System.out.println("Your allow for Vote");
			}
		}
		catch(InvalidAgeException ie)
		{
			ie.printStackTrace();
		}
	}

}
