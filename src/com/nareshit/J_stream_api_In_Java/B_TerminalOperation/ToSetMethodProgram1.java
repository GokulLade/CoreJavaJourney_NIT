package com.nareshit.J_stream_api_In_Java.B_TerminalOperation;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToSetMethodProgram1 {

	public static void main(String[] args) 
	{
		Stream<Object> streamData = Stream.of("Gokul",200,30.45,'G');
		Set<Object> setData = streamData.collect(Collectors.toSet());
		setData.forEach(System.out::println);
		
	}

}
