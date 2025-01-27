package com.nareshit.J_stream_api_In_Java.B_TerminalOperation;

import java.util.Arrays;
import java.util.List;

public class NonMatchMethodProgram01 {

	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(1, 3, 2, 7, 9, 3, 11);

		boolean noneEven = numbers.stream().noneMatch(number -> number % 2 == 0);

		if (noneEven) {
			System.out.println("There are no even numbers.");
		} else {
			System.out.println("There is at least one even number.");
		}

	}

}
