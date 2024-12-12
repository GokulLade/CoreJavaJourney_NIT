package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface.C_ArrayListClass;

import java.util.ArrayList;
import java.util.Vector;

public class CopyingElementsIntoVectorProgram01 {

	public static void main(String[] args)
	{
		ArrayList<String> cityName = new ArrayList<>();
		cityName.add("Hyd");
		cityName.add("Bglr");
		cityName.add("Kolkata");
		
		
		Vector<String> v1 = new Vector<>(cityName);
		v1.forEach(System.out::println);

	}

}
