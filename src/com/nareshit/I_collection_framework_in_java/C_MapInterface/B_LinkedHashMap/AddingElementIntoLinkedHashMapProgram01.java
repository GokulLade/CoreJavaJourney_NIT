package com.nareshit.I_collection_framework_in_java.C_MapInterface.B_LinkedHashMap;

import java.util.LinkedHashMap;

public class AddingElementIntoLinkedHashMapProgram01 {

	public static void main(String[] args) 
	{
		LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
		map.put(103, "Gokul");
		map.put(101, "Ganesh");
		map.put(104, "Rushi");
		map.put(102, "Vaibhav");
		map.put(105, "Akash");
		
		System.out.println(map);

	}

}
