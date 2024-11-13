package com.nareshit.G_exceptionhandling_in_java;

import java.util.Scanner;

public class NormalProgramTerminationProgram01 {

	public static void main(String[] args) 
	{
		System.out.println("Main method Started");
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter First Number");
			int num1=sc.nextInt();
			
			System.out.println("Enter Second Number");
			int num2=sc.nextInt();
			
			int result =num1/num2;
			
			System.out.println(result);
			
			System.out.println("try block end");
			
		}
		catch(Exception e)
		{
			System.out.println("Catch");
			System.out.println(e);
			
		}
		
		System.out.println("Main method end");

	}

}
