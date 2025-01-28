package com.nareshit.J_stream_api_In_Java.B_TerminalOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMethodProgram04 {

	public static void main(String[] args) 
	{
		List<String> words = Arrays.asList("Java", "is", "Best","Language");

        Optional<String> concatenated = words.stream()
                                             .reduce((a, b) -> a + " " + b);

        concatenated.ifPresent(System.out::println);

	}

}
