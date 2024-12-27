package com.nareshit.D_java_support_concepts.J_working_with_generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class UnknownClass {
	public int addValues(List list) // generic to raw type
	{
		Iterator it = list.iterator();
		int total = 0;
		while (it.hasNext()) 
		{
			int i = ((Integer) it.next());
			total += i; // total = 15
		}
		
		return total;
	}
}

public class MixingGenericsWithNonGenericsProgram02 {

	public static void main(String[] args) 
	{
		List<Integer> myList = new ArrayList<>();
		myList.add(4);
		myList.add(6);
		myList.add(5);

		UnknownClass u = new UnknownClass();
		int total = u.addValues(myList);
		System.out.println("The sum of Integer Object is :" + total);
	}

}
