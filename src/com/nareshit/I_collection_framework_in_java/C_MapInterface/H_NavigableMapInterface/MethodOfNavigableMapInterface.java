package com.nareshit.I_collection_framework_in_java.C_MapInterface.H_NavigableMapInterface;

import java.util.NavigableMap;
import java.util.TreeMap;

public class MethodOfNavigableMapInterface {

	public static void main(String[] args) 
	{
		NavigableMap<Object,Object> map=new TreeMap<>();
		map.put(104, "Java");
		map.put(102, "Html");
		map.put(103, "Python");
		map.put(101, "CSS");
		
		System.out.println(map.ceilingEntry(103));//103=Python
		System.out.println(map.ceilingKey(102));//102
		System.out.println(map.floorEntry(103));//103=Python
		System.out.println(map.floorKey(105));//104
		System.out.println(map.higherEntry(101));//102=Html
		System.out.println(map.higherKey(103));//104
		System.out.println(map.lowerEntry(103));//102=Html
		System.out.println(map.lowerKey(103));//102

	}

}
