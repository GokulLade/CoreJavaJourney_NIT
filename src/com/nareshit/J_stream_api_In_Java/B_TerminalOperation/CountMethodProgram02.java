package com.nareshit.J_stream_api_In_Java.B_TerminalOperation;

import java.util.List;

public class CountMethodProgram02 {

	public static void main(String[] args) 
	{
		List<String> listOfName = List.of("Raj", "Ravi", "Virat", "Rohit", "Ram", "Bumrah", "Sachin");

		long names = listOfName.stream().filter(name -> name.length() > 3).count();
		System.out.println("Names whose length is > 3 are :" + names);

	}

}
