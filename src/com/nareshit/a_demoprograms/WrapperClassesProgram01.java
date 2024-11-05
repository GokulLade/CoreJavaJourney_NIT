package com.nareshit.a_demoprograms;
/*
 
	a) Autoboxing:
		-> primitive convert into object.
		
	b) Unboxing:
		-> Object convert into primitive
 
 * */
public class WrapperClassesProgram01 {

	public static void main(String[] args)
	{
		/*
		 a) Autoboxing:
			-> primitive convert into object.
		*/
		int num=10;
		
		Integer i=Integer.valueOf(num);
		
		/*
		 b) Unboxing:
			-> Object convert into primitive
		*/
		
		Integer num1=20;
		int num2=num1;
		
		System.out.println(num2);
		
	}

}
