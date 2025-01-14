package com.nareshit.D_java_support_concepts.K_method_reference;

import java.util.Scanner;
import java.util.function.Function;

class Accept
{
	private int x;
	
	public Accept(int x)    
	{
		this.x = x;
	}
	
	public int getX()
	{
		return this.x;
	}	
}

public class ConstructorReferenceProgram02 
{
	public static void main(String[] args) 
	{
	   Function<Integer,Accept> fn1 =  Accept::new;
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the value of x :");
	   int no = sc.nextInt();
	   
	   Accept obj = fn1.apply(no);
	   System.out.println("x value is :"+obj.getX());
	   sc.close();
	   
	}

}
