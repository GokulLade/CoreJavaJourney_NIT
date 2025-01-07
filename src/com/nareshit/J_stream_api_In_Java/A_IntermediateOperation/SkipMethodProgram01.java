package com.nareshit.J_stream_api_In_Java.A_IntermediateOperation;

import java.util.stream.Stream;

public class SkipMethodProgram01 {

	public static void main(String[] args) 
	{
		//skip() method with Integer
		Stream<Integer> number = Stream.of(2,3,1,4,5);
		number.skip(3).forEach(System.out::print);
		System.out.println();
		
		// skip() method with String
		Stream<String> of = Stream.of("Virat", "Rohit", "Rahul", "Gill", "Pant", "Bumrah", "Nitish");
		of.skip(2).forEach(System.out::println);

	}

}
