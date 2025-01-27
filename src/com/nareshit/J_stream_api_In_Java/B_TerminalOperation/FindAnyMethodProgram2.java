package com.nareshit.J_stream_api_In_Java.B_TerminalOperation;

import java.util.List;
import java.util.Optional;

public class FindAnyMethodProgram2 {

	public static void main(String[] args)
	{
		List<String> listOfNames = List.of("Raj", "Rahul", "Anuradha", "Ankit", "Sachin", "Aryan");

		Optional<String> findAny = listOfNames.parallelStream().findAny();

		findAny.ifPresent(System.out::println);

	}

}
