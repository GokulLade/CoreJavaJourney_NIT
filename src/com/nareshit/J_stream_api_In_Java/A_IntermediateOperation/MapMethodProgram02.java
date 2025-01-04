package com.nareshit.J_stream_api_In_Java.A_IntermediateOperation;

//Find the length of the name
import java.util.Arrays;
import java.util.List;

public class MapMethodProgram02 {

	public static void main(String[] args) 
	{
		List<String> listOfName = Arrays.asList("Rahul", "Scott", "Raj", "Elina", "Aaarti", "Puja");

		listOfName.stream().map(str -> str.length()).forEach(System.out::println);

	}
}
