package com.nareshit.I_collection_framework_in_java.D_ConcurrentCollections;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConvertingHashMapToConcurrentHashMapProgram01 {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Ravi");
		hashMap.put(2, "Ankit");
		hashMap.put(3, "Prashant");
		hashMap.put(4, "Pallavi");

		ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>(hashMap);
		System.out.println("Object from ConcurrentHashMap: " + concurrentHashMap);
	}

}
