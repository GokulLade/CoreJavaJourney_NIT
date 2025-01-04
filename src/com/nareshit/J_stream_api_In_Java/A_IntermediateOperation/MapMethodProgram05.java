package com.nareshit.J_stream_api_In_Java.A_IntermediateOperation;

import java.util.Arrays;
import java.util.List;

//Retrieve the name whose length is > 3 and convert those names in uppercase
public class MapMethodProgram05 {

	public static void main(String[] args) 
	{
		List<String> listOfName = Arrays.asList("Rahul", "Scott", "Raj", "Elina", "Ram", "Puja");

		listOfName.stream().filter(str -> str.length() > 3).map(name -> name.toUpperCase()).forEach(System.out::println);

	}

}
