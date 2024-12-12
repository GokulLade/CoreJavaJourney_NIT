package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface.C_ArrayListClass;

import java.util.Arrays;
import java.util.List;

public class FixLengthListProgram01 {

	public static void main(String[] args) 
	{
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		list.set(2, 10);// valid
//		list.add(7); invalid
		
		System.out.println(list);

	}

}
