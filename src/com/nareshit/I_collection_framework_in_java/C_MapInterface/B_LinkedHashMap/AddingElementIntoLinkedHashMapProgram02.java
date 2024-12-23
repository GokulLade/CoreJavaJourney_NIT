package com.nareshit.I_collection_framework_in_java.C_MapInterface.B_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class AddingElementIntoLinkedHashMapProgram02 {

	public static void main(String[] args) 
	{
		Map<String, String> map = new LinkedHashMap<>();
		map.put("Ravi", "1234");
		map.put("Rahul", "1234");
		map.put("Aswin", null);
		map.put("Samir", null);

		map.forEach((k, v) -> System.out.println(k + " : " + v));

	}

}
