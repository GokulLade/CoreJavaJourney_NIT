package com.nareshit.J_stream_api_In_Java;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsObjectToStreamProgram01 {

	public static void main(String[] args)
	{
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		//Collections Object to Stream
		Stream<Integer> stm=al.stream();
		stm.forEach(i1->System.out.println(i1));

	}

}
