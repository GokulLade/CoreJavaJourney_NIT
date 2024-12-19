package com.nareshit.I_collection_framework_in_java.C_MapInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConvertingMapIntoCollectionMethods {

	public static void main(String[] args) 
	{
		Map<Integer,String> map=new HashMap<>();
		map.put(104, "Ram");
		map.put(103, "Gokul");
		map.put(105, "Vikram");
		map.put(101, "Rushi");
		map.put(102, "Ganesh");
		
		//Storing keys into Set
		Set<Integer> keySet = map.keySet(); 
		keySet.forEach(x->System.out.println(x));
		System.out.println();
		
		//Storing Values into Collection
		Collection<String> values = map.values();
		values.forEach(x->System.out.println(x));
		System.out.println();
		//Storing keys and values into Set
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		entrySet.forEach(x->System.out.println(x));
		
	}

}
