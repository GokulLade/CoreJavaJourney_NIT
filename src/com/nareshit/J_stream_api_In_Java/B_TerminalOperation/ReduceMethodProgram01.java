package com.nareshit.J_stream_api_In_Java.B_TerminalOperation;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceMethodProgram01 {

	public static void main(String[] args) 
	{
		// Example 1: Finding the sum of integers in a stream
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

        Optional<Integer> sum = integerStream.reduce(Integer::sum);// like sum+=integerStream[0]

        System.out.println(sum.get());



	}

}
