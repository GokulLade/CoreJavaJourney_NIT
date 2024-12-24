package com.nareshit.I_collection_framework_in_java.C_MapInterface.F_TreeMap;

import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortedSetSortedMapAsparameter {

	public static void main(String[] args) 
	{
		SortedSet<String> ts1 = new TreeSet<>();
		ts1.add("Hyd");
		ts1.add("Pune");
		ts1.add("Indore");
		
		TreeSet<String> ts2 = new TreeSet<>(ts1);
		System.out.println(ts2);
		
		TreeMap<String,String> tm1 = new TreeMap<>();
		tm1.put("ravi@gmail.com", "ravi1234");
		tm1.put("scott@gmail.com", "scott1234");
		tm1.put("smith@gmail.com", "smith1234");
		
		TreeMap<String,String> tm2 = new TreeMap<String,String>(tm1);
		System.out.println(tm2);


	}

}
