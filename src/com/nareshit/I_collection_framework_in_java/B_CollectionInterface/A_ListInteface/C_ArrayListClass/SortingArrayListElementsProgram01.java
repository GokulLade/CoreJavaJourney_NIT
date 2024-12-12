package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface.C_ArrayListClass;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayListElementsProgram01 {

	public static void main(String[] args) 
	{
		ArrayList<String> cities = new ArrayList<>();

		cities.add("Hyderabad");
		cities.add("Delhi");
		cities.add("Banglore");
		cities.add("Chennai");

		System.out.println("Before sorting: " + cities);

		Collections.sort(cities);
		System.out.println("After sorting (Ascending): " + cities);

		Collections.sort(cities, Collections.reverseOrder());
		System.out.println("After sorting (Descending): " + cities);

	}

}