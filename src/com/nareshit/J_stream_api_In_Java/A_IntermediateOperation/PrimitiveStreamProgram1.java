package com.nareshit.J_stream_api_In_Java.A_IntermediateOperation;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamProgram1 {

	public static void main(String[] args) 
	{
		IntStream intNumbers = IntStream.of(1,2,3,4,5);
		LongStream longNumbers = LongStream.of(1L,2L,3L,4L,5L);
		DoubleStream doubleNumbers = DoubleStream.of(1.2,3.2,1.3,44.5,2.2);
		
		intNumbers.forEach(num->System.out.print(num+" "));
		longNumbers.forEach(num->System.out.print(num+" "));
		doubleNumbers.forEach(num->System.out.print(num+" "));
		
		int a[] = {1,2,3,4,5};
		IntStream intStream2 = Arrays.stream(a);
		
		long l[] = {1L, 2L, 3L, 4L};
		LongStream longStream2 = Arrays.stream(l);
		
		double d[] = {1.2, 2.6, 3.9, 8.9};
		DoubleStream doubleStream2 = Arrays.stream(d);
		
		intStream2.forEach(System.out::print );
		System.out.println();
		longStream2.forEach(System.out::print);
		System.out.println();
		doubleStream2.forEach(System.out::print);

	}

}
