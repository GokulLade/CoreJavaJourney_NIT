package com.nareshit.I_collection_framework_in_java.D_ConcurrentCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CollectionsSynchronizedMapMethod {

	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "Ravi");
		map.put("4", "Elina");
		map.put("3", "Aryan");
		Map<String, String> synmap = Collections.synchronizedMap(map);
		System.out.println("Synchronized map is :" + synmap);

	}

}
