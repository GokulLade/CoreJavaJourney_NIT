package com.nareshit.D_java_support_concepts.J_working_with_generics;

import java.util.Arrays;
import java.util.List;

public class ProgramOnWildcard {

	public static void main(String[] args) 
	{

//		ArrayList<?> list1 = new ArrayList<Integer>();
//		list1.add(12);
//
//		var<?> list = new ArrayList<Integer>();
//		list.add(12);
//		list.add(13);
//		list.add(14);
//		list.add(15);
//		System.out.println(list);
//
//		List<? extends Number> numbers = Arrays.asList(1, 2, 3, 4, 5);
//		numbers.set(0, 12);

		List<? super Integer> myNumbers = Arrays.asList(1, 2, 3, 4, 5);
		myNumbers.set(0, 12);
		System.out.println(myNumbers);

	}

}
