package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.D_predefined_functional_interface;

import java.util.function.BiPredicate;

// Check the Addition of number is Even number or not
public class BiPredicateProgram01 {

	public static void main(String[] args)
	{
		BiPredicate<Integer,Integer> checkEven =(num1,num2)-> (num1+num2)%2==0;
		
		System.out.println("The sum of two number is Even "+checkEven.test(20,20));

	}

}
