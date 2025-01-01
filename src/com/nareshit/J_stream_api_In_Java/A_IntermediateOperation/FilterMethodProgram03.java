package com.nareshit.J_stream_api_In_Java.A_IntermediateOperation;

//Retrieve all the names which starts from R and duplicates are allowed
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterMethodProgram03 {

	public static void main(String[] args) 
	{
		
		List<String> collect = Stream.of("Aryan", "Ankit", "Raj", "Rohit", "Aniket", "Raj", "Aryan")
				.filter(str -> str.startsWith("R")).collect(Collectors.toList());

		System.out.println(collect);

	}

}
