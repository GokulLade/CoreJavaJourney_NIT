package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface.A_VectorClass;

import java.util.Collections;
import java.util.Vector;

public class AddSortRemoveElementProgram01 {

	public static void main(String[] args) 
	{
		Vector<String> listOfCity = new Vector<>();
		listOfCity.add("Pune");
		listOfCity.add("Mumbai");
		listOfCity.add("Hyderabad");
		listOfCity.add("Nanded");
		
		System.out.println(listOfCity);

		Collections.sort(listOfCity); //Sorting Cities
		System.out.println(listOfCity);
		
		listOfCity.remove("Nanded"); //remove using object
		System.out.println(listOfCity);
		
		listOfCity.remove(1); //Remove using index
		System.out.println(listOfCity);
		
		

	}

}
