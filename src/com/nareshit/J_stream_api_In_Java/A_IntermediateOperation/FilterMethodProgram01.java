package com.nareshit.J_stream_api_In_Java.A_IntermediateOperation;

//Filter all the even numbers from Collection 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterMethodProgram01 {

	public static void main(String[] args) 
	{
		//Finding Even number without using Stream
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14);
		
		ArrayList<Integer> evenNumber=new ArrayList<>();
		
		for(Integer number:numbers)
		{
			if(number%2==0)
			{
				evenNumber.add(number);
			}
		}
		System.out.println("Finding Even number without using Stream");
		evenNumber.forEach(System.out::println);
		
		System.out.println("Finding Even number using Stream");
		numbers.stream().filter(num->num%2==0).forEach(System.out::println);

	}

}
