package com.nareshit.G_exceptionhandling_in_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithCatchInsideCatchProgram01 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter your Age");
			int age=sc.nextInt();
			
			System.out.println("Your Age is : "+age);
		}
		
		catch(InputMismatchException ie)
		{
			try {
				int arr[]= {10,20,30};
				System.out.println(arr[3]);
			}
			catch(ArrayIndexOutOfBoundsException ae)
			{
				System.out.println(ae);
			}
		}
		finally
		{
			try {
				int arr[]= {10,20,30};
				System.out.println("Enter the Index Number");
				int index=sc.nextInt();
				System.out.println(arr[3]);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}

	}

}
