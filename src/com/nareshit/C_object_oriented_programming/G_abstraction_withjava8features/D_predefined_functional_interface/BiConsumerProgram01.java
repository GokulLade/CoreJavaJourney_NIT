package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.D_predefined_functional_interface;

import java.util.function.BiConsumer;

// Update variable Values
public class BiConsumerProgram01 {

	public static void main(String[] args) 
	{
		BiConsumer<Integer, String> updateValue=(num,str)->{
			
			num=num*2;
			str=str.toUpperCase();
			
			System.out.println("Updated Values Are "+num+" "+str);
		};
		
		int num=10;
		String str="Gokul";
		
		updateValue.accept(num, str);
		
		System.out.println("Original Values Are "+num+" "+str);
		
	}

}
