package com.nareshit.I_collection_framework_in_java.C_MapInterface.A_HashMapClass;

import java.util.HashMap;
import java.util.Map;

public class EqualAndHashcodeMethodContractProgram01 {

	public static void main(String[] args) 
	{
		Map<Object,Object> map1=new HashMap<>();
		map1.put("A", 1);
		map1.put("A", 2);
		map1.put(new String("A"), 3);
		System.out.println("Size is :"+map1.size()); //1
		System.out.println(map1); //{A=3}
		System.out.println("....................");
		
		HashMap<Integer,Integer> map2 = new HashMap<>();
		map2.put(128, 1);
		map2.put(128, 2);
		System.out.println("Size is :"+map2.size()); // 1
		System.out.println(map2); //{128=2}
		System.out.println("....................");
	

		HashMap<Object,Object> map3 = new HashMap<>();
		map3.put("A", 1);
		map3.put("A", 2);
		map3.put(new String("A"), 3);
		map3.put(65, 4);
		System.out.println("Size is :"+map3.size()); //2
		System.out.println(map3);//{A=3 , 65=4},


	}

}
