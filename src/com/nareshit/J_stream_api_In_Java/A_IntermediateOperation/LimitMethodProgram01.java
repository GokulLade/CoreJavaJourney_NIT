package com.nareshit.J_stream_api_In_Java.A_IntermediateOperation;

import java.util.stream.Stream;

public class LimitMethodProgram01 {

	public static void main(String[] args) 
	{
		// Working with limit method
		Stream<String> s = Stream.of("Virat", "Rohit", "Dhoni", "Zaheer", "Raina", "Sahwag", "Sachin", "Bumrah");
		s.limit(6).forEach(System.out::println);
		System.out.println("..................");
		
		// Working with infinite Stream
		Stream<Double> limit = Stream.generate(() -> Math.random()).limit(15);
		limit.forEach(System.out::println);
		System.out.println("...............");
		
		// Working with infinite Stream
		Stream<Integer> iterate = Stream.iterate(11, n -> n + 1).limit(10);
		iterate.forEach(System.out::println);

	}

}
