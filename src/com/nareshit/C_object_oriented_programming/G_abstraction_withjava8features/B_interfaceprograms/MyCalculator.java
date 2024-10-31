package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.B_interfaceprograms;

import java.util.Scanner;

interface AdvancedArithmetic{
	int divisorSum(int num); 
}

public class MyCalculator implements AdvancedArithmetic {
	
	@Override
	public int divisorSum(int num) {
		int sum=0;
			for(int i=num;i>0;i--)
			{
				if(num%i==0)
				{
					sum+=i;
				}
			}
		return sum;
		
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		if(num<=0) 
		{
			System.out.println("Input must be a positive integer.");
		}
		else {
			MyCalculator cal=new MyCalculator();
			
			int sum=cal.divisorSum(num);
			
			System.out.println("The "+num+" Divisor sum is "+sum);
		}

	}

}
