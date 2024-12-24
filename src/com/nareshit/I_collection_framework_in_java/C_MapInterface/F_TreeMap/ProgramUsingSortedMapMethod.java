package com.nareshit.I_collection_framework_in_java.C_MapInterface.F_TreeMap;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class ProgramUsingSortedMapMethod {

	public static void main(String[] args) 
	{

        Map<String, String> map = new TreeMap<>();  
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key1", "value1");

        System.out.println(map);

        SortedMap<String, String> x = (SortedMap<String, String>) map;
        System.out.println("First key is :"+x.firstKey());
        System.out.println("Last Key is :"+x.lastKey()); 


	}

}
