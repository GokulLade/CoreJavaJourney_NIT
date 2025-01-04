package com.nareshit.J_stream_api_In_Java.A_IntermediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Fetching first character using flatMap()
public class FlatMapMethodProgram03 {

	public static void main(String[] args) 
	{
		List<String> listOfNames = Arrays.asList("Jaya","Aryan","Virat","Aakash");
	    List<Character> collect = listOfNames.stream().flatMap(str -> Stream.of(str.charAt(0))).collect(Collectors.toList());
	    System.out.println(collect);

	}

}
