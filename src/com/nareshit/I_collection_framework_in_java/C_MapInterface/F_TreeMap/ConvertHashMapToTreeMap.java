package com.nareshit.I_collection_framework_in_java.C_MapInterface.F_TreeMap;

import java.util.HashMap;
import java.util.TreeMap;

public class ConvertHashMapToTreeMap {

	public static void main(String[] args) 
	{
		HashMap<Object,Object> hm=new HashMap<>();
		hm.put(110, "Hyderabad");
		hm.put(120, "Pune");
		hm.put(130, "Mumbai");
		
		System.out.println(hm);
		
		TreeMap<Object, Object> tm=new TreeMap<>(hm);
		tm.put(140, "Nagpur");
		tm.put(150, "Delhi");
		tm.put(160, "Chenai");
		
		System.out.println(tm);

	}

}
