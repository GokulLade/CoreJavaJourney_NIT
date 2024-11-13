package com.nareshit.G_exceptionhandling_in_java;

import java.util.Scanner;

public class UserFriendlyMessageProgram01 {

	public static void main(String[] args)
	{
		 System.out.println("Hello Client!! Welcome to my Application");
		 Scanner sc = new Scanner(System.in);
		 try
		 {
			System.out.print("Enter your Employee Id :");
			int id = sc.nextInt();
			System.out.print("Enter your Employee Name :");
			String name = sc.nextLine();
			name = sc.nextLine();
			
			System.out.println("Hello "+name+ " your employee id is :"+id);
			
			System.out.println("You have registered successfully!!!");
		 }
		catch(Exception e)
		{
		
			System.err.println("Please provide only numeric values");
		}
		 
		System.out.println("Thank you for Visiting my application.");
		sc.close();
	}

}
