package com.nareshit.J_stream_api_In_Java.B_TerminalOperation;

import java.util.List;
import java.util.Optional;

public class FindAnyMethodProgram01 {

	public static void main(String[] args) 
	{
		List<String> listOfName = List.of("Sachin", "Ankit", "Aman", "Rahul", "Ravi");

		Optional<String> anyElement = listOfName.parallelStream().filter(s -> s.startsWith("R")).findAny();

		anyElement.ifPresent(System.out::println);

	}

}
