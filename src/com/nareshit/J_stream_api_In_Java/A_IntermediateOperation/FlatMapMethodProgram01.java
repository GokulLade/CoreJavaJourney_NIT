package com.nareshit.J_stream_api_In_Java.A_IntermediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// flatMap() map + Flattening [Converting Collections of collection into single collection]
public class FlatMapMethodProgram01 {

	public static void main(String[] args) 
	{
		List<String> list1 = Arrays.asList("A","B","C");
		List<String> list2 = Arrays.asList("D","E","F");
		List<String> list3 = Arrays.asList("G","H","I");
		
		List<List<String>> nestedColl = Arrays.asList(list1, list2, list3);
		System.out.println("Original Nested Collection :"+nestedColl);
		
		List<String> flatColl = nestedColl.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println(flatColl);


	}

}