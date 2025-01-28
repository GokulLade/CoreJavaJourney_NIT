package com.nareshit.J_stream_api_In_Java.B_TerminalOperation;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByMethodProgram02 {

	public static void main(String[] args)
	{
		List<String> listOfCountry = List.of("India", "Australia", "USA", "China", "Japan");

		Map<String, Integer> map = listOfCountry.stream()
				.collect(Collectors.toMap(item -> item, item -> item.length()));

		map.forEach((key, value) -> {
			System.out.println(key + ": " + value);
		});

	}

}
