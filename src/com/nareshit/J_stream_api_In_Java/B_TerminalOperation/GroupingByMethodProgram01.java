package com.nareshit.J_stream_api_In_Java.B_TerminalOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByMethodProgram01 {

	public static void main(String[] args) 
	{
		List<String> items = Arrays.asList("Delhi", "Indore", "Kolkata", "Pune", "Hyderabad", "Mumbai");

		Map<Integer, List<String>> groupedByLength = items.stream().collect(Collectors.groupingBy(String::length));

		groupedByLength.forEach((length, words) -> {
			System.out.println("Length " + length + ": " + words);
		});

	}

}
