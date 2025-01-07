package com.nareshit.J_stream_api_In_Java.A_IntermediateOperation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekMethodProgram01 {

	public static void main(String[] args)
	{
		Stream<String> streamOfFruits = Stream.of("Apple", "Mango", "Grapes", "Kiwi", "pomogranate");

		List<Integer> fruitLength = streamOfFruits
				.peek(str -> System.out.println("Peeking from Original: " + str.toUpperCase()))
				.map(fruit -> fruit.length()).collect(Collectors.toList());
		
		System.out.println("-----------------");
		System.out.println(fruitLength);

	}

}
