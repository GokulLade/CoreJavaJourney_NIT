package com.nareshit.a_demoprograms;

// Fibonacci => 0 1 1 2 3 5 8 ... 

public class UpcastingProgram {
	
	public static void main(String[] args)
	{
		int num1=0,num2=1;
		System.out.print(num1+" "+num2+" ");
		int limit=10;
		for(int i=3;i<=limit;i++) {
			int next=num1+num2;
			num1=num2;
			num2=next;
			System.out.print(next+" ");
		}
		
	}

}
