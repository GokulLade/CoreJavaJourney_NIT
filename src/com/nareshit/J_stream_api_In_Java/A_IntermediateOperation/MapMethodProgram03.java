package com.nareshit.J_stream_api_In_Java.A_IntermediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Retrieve first character of all the given name
public class MapMethodProgram03 {

	public static void main(String[] args) 
	{
		List<String> listOfName = Arrays.asList("Jaya", "Arnav", "Virat", "Aryan");

		List<Character> collect = listOfName.stream().map(str -> str.charAt(0)).collect(Collectors.toList());
		System.out.println(collect);

	}

}
