package com.nareshit.J_stream_api_In_Java.B_TerminalOperation;

import java.util.List;

public class CountMethodProgram03 {

	public static void main(String[] args) 
	{
		List<String> listOfName = List.of("Raj", "Raj", "Ravi", "Virat", "Raj");

		long count = listOfName.stream().distinct().count();

		System.out.println("Count of unique elements: " + count);

	}

}
