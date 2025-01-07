package com.nareshit.J_stream_api_In_Java.A_IntermediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class FlatMapToLongMethodProgram01 {

	public static void main(String[] args) 
	{
		long arr1[]= {2L,3L,4L,5L};
		long arr2[]= {6L,7L,8L,9L};
		long arr3[]= {12L,13L,14L,15L};
		
		List<long[]> asList = Arrays.asList(arr1,arr2,arr3);

		LongStream longStream = asList.stream().flatMapToLong(arr->Arrays.stream(arr));
		longStream.forEach(System.out::print);
	}

}
