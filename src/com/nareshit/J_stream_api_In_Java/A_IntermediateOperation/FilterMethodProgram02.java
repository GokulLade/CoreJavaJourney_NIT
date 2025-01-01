package com.nareshit.J_stream_api_In_Java.A_IntermediateOperation;

//Retrieve all the names which starts from A and it should not contain duplicate
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterMethodProgram02 {
	

	public static void main(String[] args) 
	{
		List<String> listOfName = List.of("Aryan","Ankit","Raj","Rohit","Aniket","Raj","Aryan");
		
		 Set<String> collect = listOfName.stream().filter(str -> str.startsWith("A")).collect(Collectors.toSet());
		System.out.println(collect);
		
	}


}
