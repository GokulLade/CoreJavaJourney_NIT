package com.nareshit.I_collection_framework_in_java.C_MapInterface.F_TreeMap;

import java.util.TreeMap;

public class AddingElementIntoTreeMap {

	public static void main(String[] args) 
	{
		TreeMap<Integer, String> map=new TreeMap<>();
		map.put(103, "Hyderbad");
		map.put(105, "Pune");
		map.put(102, "Mumbai");
		map.put(101, null);
		map.put(104, "null");
		
		System.out.println(map);

	}

}
