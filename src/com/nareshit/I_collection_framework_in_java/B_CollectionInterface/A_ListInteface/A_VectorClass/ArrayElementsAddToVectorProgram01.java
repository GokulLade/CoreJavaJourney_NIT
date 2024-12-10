package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface.A_VectorClass;

import java.util.Collections;
//Adding array values to Vector
import java.util.Vector;

public class ArrayElementsAddToVectorProgram01 {

	public static void main(String[] args) 
	{
		Vector<Integer> num=new Vector<Integer>();
		
		int x[]= {30,20,44,30,77,23,12};
		
		for(int value: x)
		{
			num.add(value);
		}
		
		Collections.sort(num);
		System.out.println("Maximum value is : "+Collections.max(num));
		System.out.println("Minimum value is : "+Collections.min(num));
		
		System.out.print("Vector Elements are : ");
		num.forEach(num1->System.out.print(num1+", "));

		System.out.println();
		
		Collections.reverse(num);
		System.out.print("Vector Reverse Elemets are: ");
		num.forEach(num1->System.out.print(num1+", "));
	}

}
