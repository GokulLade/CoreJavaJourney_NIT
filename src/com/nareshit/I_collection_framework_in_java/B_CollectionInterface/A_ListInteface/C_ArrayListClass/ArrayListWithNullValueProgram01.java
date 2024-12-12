package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface.C_ArrayListClass;

import java.util.ArrayList;

//Program on ArrayList that contains null values as well as we can pass the element based on the index position

public class ArrayListWithNullValueProgram01 {

	public static void main(String[] args) 
	{
		ArrayList<Object> al = new ArrayList<>();
		al.add(12);
		al.add("Gokul");
		al.add(12);
		al.add(3, "Hyderabad");
		al.add(1, "Naresh");
		al.add(null);
		al.add(11);
		System.out.println(al);

	}

}
