package com.nareshit.D_java_support_concepts.M_optionalclass_in_java;

import java.util.Optional;

public class OptionalClassProgram01 {

	public static void main(String[] args) 
	{
		String str = null;

		Optional<String> optional = Optional.ofNullable(str);

		String orElse = optional.orElse("No value in container");
		System.out.println("Value by orElse :" + orElse);

		// Optional is containing value or not?
		if (optional.isPresent()) 
		{
			System.out.println("Value by get :" + optional.get());
		} 
		else
		{
			System.err.println("No value is available in the container");
		}

	}

}
