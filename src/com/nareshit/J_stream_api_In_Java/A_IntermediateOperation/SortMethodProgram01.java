package com.nareshit.J_stream_api_In_Java.A_IntermediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortMethodProgram01 {

	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("Zaheer","Rahul","Aryan","Sailesh","Zaheer");

		List<String> collect = names.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(collect);


	}

}
