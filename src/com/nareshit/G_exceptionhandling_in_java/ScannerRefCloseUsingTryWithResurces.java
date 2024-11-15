package com.nareshit.G_exceptionhandling_in_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerRefCloseUsingTryWithResurces {

	public static void main(String[] args) 
	{
		var sc=new Scanner(System.in);
		
		try(sc) {
			System.out.println("Enter Your Age :");
			int age=sc.nextInt();
			
			System.out.println("Your Age is:"+age);
		}
		catch(InputMismatchException ie)
		{
			System.out.println("Input is not in proper format");
		}

		System.out.println("Program Completed..!");
	}

}
