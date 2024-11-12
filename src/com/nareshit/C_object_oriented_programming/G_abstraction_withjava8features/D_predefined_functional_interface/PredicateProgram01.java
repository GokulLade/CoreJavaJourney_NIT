package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.D_predefined_functional_interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateProgram01 {

	public static void main(String[] args) 
	{
		Predicate<Integer> findEven=number->number%2==0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to check the Even or Odd");
		int number=sc.nextInt();
		
		if(number<=0)
		{
			if(number==0)
			{
				System.out.println("Number is Zero");
			}
			else
			{
				System.out.println("Number is Nagative");
			}
			
		}
		else if(findEven.test(number))
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}

}
