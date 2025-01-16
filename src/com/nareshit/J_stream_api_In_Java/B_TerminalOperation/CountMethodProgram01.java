package com.nareshit.J_stream_api_In_Java.B_TerminalOperation;

import java.util.stream.Stream;

public class CountMethodProgram01 {

	public static void main(String[] args) 
	{
		long count = Stream.of("Ravi","Raj","Elina","Aryan","Sachin").count();
		System.out.println(count);

	}

}
