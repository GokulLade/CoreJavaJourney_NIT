package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.B_SetInterface.C_SortedSetInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingIntegerInDescending {

	public static void main(String[] args) 
	{
		List<Integer> list= new ArrayList<>();
		list.add(20);
		list.add(10);
		list.add(7);
		list.add(22);
		
		//Sorting Integer object in descending Order.
		Collections.sort(list,(i1,i2)->i2.compareTo(i1));
		list.forEach(System.out::println);

	}

}
