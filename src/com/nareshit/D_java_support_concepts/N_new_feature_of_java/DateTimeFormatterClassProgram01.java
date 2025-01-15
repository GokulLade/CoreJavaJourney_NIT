package com.nareshit.D_java_support_concepts.N_new_feature_of_java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterClassProgram01 {

	public static void main(String[] args) 
	{
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");
		
		String formattedDateTime = now.format(formatter);
		System.out.println("Formatted DateTime: " + formattedDateTime);

	}

}
