package com.nareshit.J_stream_api_In_Java.B_TerminalOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMethodProgram03 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		Optional<Integer> product = numbers.stream().reduce((a, b) -> a * b); //like number=number*numbers[0]

		product.ifPresent(System.out::println);

	}

}
