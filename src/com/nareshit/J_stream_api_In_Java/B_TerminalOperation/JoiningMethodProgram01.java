package com.nareshit.J_stream_api_In_Java.B_TerminalOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningMethodProgram01 {

	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("a", "b", "c", "d");
        String result = list.stream().collect(Collectors.joining("-"));
        System.out.println(result); 

	}

}
