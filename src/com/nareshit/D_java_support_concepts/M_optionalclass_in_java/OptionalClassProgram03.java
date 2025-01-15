package com.nareshit.D_java_support_concepts.M_optionalclass_in_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalClassProgram03 {

	public static void main(String[] args) 
	{
		List<Optional<String>> listOfCity = new ArrayList<>();

		listOfCity.add(Optional.of("Hyderabad"));
		listOfCity.add(Optional.of("Banglore"));
		listOfCity.add(Optional.of("Pune"));
		listOfCity.add(Optional.of("Chennai"));
		//listOfCity.add(null); //java.lang.NullPointerException
		listOfCity.add(Optional.empty());

		for (Optional<String> city : listOfCity) 
		{
			if (city.isPresent()) 
			{
				System.out.println(city.get());
			} 
			else 
			{
				System.err.println("No Value in the Container");
			}
		}
	}
}
