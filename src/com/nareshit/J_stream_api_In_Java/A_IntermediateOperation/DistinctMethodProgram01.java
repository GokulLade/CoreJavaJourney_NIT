package com.nareshit.J_stream_api_In_Java.A_IntermediateOperation;

import java.util.ArrayList;
import java.util.stream.Stream;

public class DistinctMethodProgram01 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> number=new ArrayList<>();
		number.add(10);
		number.add(11);
		number.add(11);//duplicates
		number.add(13);
		number.add(14);
		System.out.println(number);
		
		Stream<Integer> removeDuplicate = number.stream().distinct();
		removeDuplicate.forEach(System.out::println);

	}

}
