package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.D_predefined_functional_interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateProgram02 {

	public static void main(String[] args) 
	{
		Predicate<Integer> findLeapYear=year-> ((year%4==0 && year%100!=0)||year%400==0);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Year to check Leap year or not");
		int year=sc.nextInt();
		
		if(findLeapYear.test(year))
		{
			System.out.println("The Year is Leap Year");
		}
		else
		{
			System.out.println("The year is not Leap Year");
		}

	}

}
