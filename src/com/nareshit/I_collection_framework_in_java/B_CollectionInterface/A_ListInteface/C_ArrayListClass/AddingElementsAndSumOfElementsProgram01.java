package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface.C_ArrayListClass;

import java.util.ArrayList;

public class AddingElementsAndSumOfElementsProgram01 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(20);
		list.add(30);
		list.add(60);
		list.add(90);
		list.add(10);
		list.add(77);
		
		int sum=0;
		for(Integer value:list)
		{
			sum += value;
		}
		
		System.out.println("Sum of Elements is : "+sum);
	}

}
