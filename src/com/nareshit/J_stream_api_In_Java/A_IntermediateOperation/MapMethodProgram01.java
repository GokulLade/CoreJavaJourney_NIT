package com.nareshit.J_stream_api_In_Java.A_IntermediateOperation;
//Add value 10 to each and every number, and Find even numbers in stream and collect the cubes
import java.util.ArrayList;
import java.util.stream.Stream;

public class MapMethodProgram01 {

	public static void main(String[] args) 
	{
		//Adding 10 value to each element
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.stream().map(num->num+10).forEach(System.out::println);
		System.out.println("-----------------------------------------");
		
		//Find even numbers in stream and collect the cubes
		Stream.of(3,6,4,8,90,12).filter(num->num%2==0).map(num->num*num*num).forEach(System.out::println);

	}

}
