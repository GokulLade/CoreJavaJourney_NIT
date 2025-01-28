package com.nareshit.J_stream_api_In_Java.B_TerminalOperation;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToMapMethodProgram {

	public static void main(String[] args)
	{
		//Keys value must be uniq
		Stream<String> fruit = Stream.of("Apple","Banana");
		Map<Integer, String> fruitMap = fruit.collect(Collectors.toMap(String::length,str-> str));
		fruitMap.forEach((strlen,str)-> System.out.println(strlen+" : "+str));
	}

}
