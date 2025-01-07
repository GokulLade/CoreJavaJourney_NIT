package com.nareshit.J_stream_api_In_Java.A_IntermediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMapToIntMethodProgram01 {

	public static void main(String[] args) 
	{
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {4,5,6,7,8};
		int arr3[]= {9,10,11,12};
		
		List<int[]> arrayList = Arrays.asList(arr1,arr2,arr3);
		IntStream intStream = arrayList.stream().flatMapToInt(arr->IntStream.of(arr));

		intStream.forEach(num->System.out.print(num+" "));
	}

}
