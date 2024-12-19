package com.nareshit.I_collection_framework_in_java.C_MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MethodOfMapInterfaceProgram01 {

	public static void main(String[] args) 
	{
		Map<Integer,String>map=new HashMap<>();
		
		//put() method
		map.put(101, "Gokul");
		System.out.println(map.put(102, "Rushi")); // return null
		System.out.println(map.put(101, "Ganesh")); //return existing value=[Gokul]
		
		//putIfAbsent() method
		System.out.println(map.putIfAbsent(103, "Vikram")); // return null
		System.out.println(map.putIfAbsent(103, "Ram")); //return existing value=[Vikram]
		
		//get() method
		System.out.println(map.get(102));//return value [Rushi]
		System.out.println(map.get(104));//return [null]
		
		//getOrDefault()
		System.out.println(map.getOrDefault(101, "Key Not Present"));//return value [Ganesh]
		System.out.println(map.getOrDefault(104, "Key Not Present"));//return [Key Not Present]
		
		//containsKey()
		System.out.println(map.containsKey(101));//true
		
		//containsValue
		System.out.println(map.containsValue("Rushi")); //true
		
		//size()
		System.out.println(map.size());
		
		//remove()
		System.out.println(map.remove(101));
		
		
		//putAll()
		Map<Integer,String>m1=new HashMap<>();
		m1.put(104,"Om");
		m1.put(105,"Shyam");
		
		map.putAll(m1);
		
		System.out.println(map);
		
		//isEmpty()
		System.out.println(m1.isEmpty());
		
		//clear()
		map.clear();
		
		if(map.isEmpty()) System.out.println("Map is Empty");
		else System.out.println("Map is not Empty");
		
		
	}

}
