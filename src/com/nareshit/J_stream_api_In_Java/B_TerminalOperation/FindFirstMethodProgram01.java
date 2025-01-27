package com.nareshit.J_stream_api_In_Java.B_TerminalOperation;

import java.util.stream.Stream;

public class FindFirstMethodProgram01 {

	public static void main(String[] args) 
	{
		Stream<String> fruitsStream = Stream.of("Virat", "Rohit", "Raj", "Bumrah", "Arshdeep");
		fruitsStream.findFirst().ifPresent(System.out::println);

	}

}
