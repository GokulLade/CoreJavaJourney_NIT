package com.nareshit.I_collection_framework_in_java.C_MapInterface.E_IdentityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class InsertingElementIntoIdentityHashMap {

	public static void main(String[] args) 
	{
		HashMap<String,Integer> hm = new HashMap<>();

		IdentityHashMap<String,Integer> ihm = new IdentityHashMap<>();
		
		hm.put("Ravi",23);
		hm.put(new String("Ravi"), 24);
		
		ihm.put("Ravi",23);
		ihm.put(new String("Ravi"), 27); //compares based on == operator
		
		System.out.println("HashMap size :"+hm.size());  
		System.out.println(hm);
		System.out.println("........................");
		System.out.println("IdentityHashMap size :"+ihm.size()); 
		System.out.println(ihm);


	}

}
