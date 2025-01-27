package com.nareshit.J_stream_api_In_Java.B_TerminalOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMethodProgram01 {

	public static void main(String[] args) 
	{
		List<Integer> number = Arrays.asList(200,33,4,22,3,12,99);
		Optional<Integer> minNumber = number.stream().min(Integer::compareTo);

		System.out.println("Minumun number is : "+minNumber.get());
	}

}
