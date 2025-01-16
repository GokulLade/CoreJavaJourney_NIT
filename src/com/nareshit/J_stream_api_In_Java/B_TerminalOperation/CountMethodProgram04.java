package com.nareshit.J_stream_api_In_Java.B_TerminalOperation;

import java.util.Arrays;
import java.util.List;

public class CountMethodProgram04 {

	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("Raj", "Ravi", "Rohit", "Virat", "Raj", "Aradhya");

		long count = list.stream().map(String::toUpperCase).filter(s -> s.contains("A")).distinct().count();

		System.out.println("Count of distinct strings containing 'A': " + count);

	}

}
