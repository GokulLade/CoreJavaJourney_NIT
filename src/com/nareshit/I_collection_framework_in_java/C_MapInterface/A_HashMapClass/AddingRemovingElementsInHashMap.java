package com.nareshit.I_collection_framework_in_java.C_MapInterface.A_HashMapClass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class AddingRemovingElementsInHashMap {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "Vanilla");
		map.put(2, "Butterscotch");
		map.put(3, "Chocolate");
		map.put(4, "Cotton Candy");

		System.out.println("HashMap: " + map);

		String value = map.get(2);
		System.out.println("Value for key 2: " + value);

		value = map.getOrDefault(8, "Key is not available");
		System.out.println("Value for key 3: " + value);

		boolean hasKey = map.containsKey(3);
		System.out.println("HashMap contains key 3: " + hasKey);

		boolean hasValue = map.containsValue("Vanilla");
		System.out.println("HashMap contains value 'Vanilla': " + hasValue);

		map.remove(1);
		System.out.println("HashMap after removing key 1: " + map);

		System.out.println("Iterating through HashMap:");
		for (HashMap.Entry<Integer, String> entry : map.entrySet()) 
		{
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}

		System.out.println("Iterating through Iterator");

		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
		itr.forEachRemaining(System.out::println);

		int size = map.size();
		System.out.println("Size of HashMap: " + size);

		map.clear();
		System.out.println("HashMap after clearing: " + map);

	}

}
