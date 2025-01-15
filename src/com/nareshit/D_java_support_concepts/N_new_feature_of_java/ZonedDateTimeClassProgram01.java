package com.nareshit.D_java_support_concepts.N_new_feature_of_java;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeClassProgram01 {

	public static void main(String[] args) 
	{
		ZoneId ausTimeZone = ZoneId.of("Australia/Sydney");
		ZonedDateTime aus = ZonedDateTime.now(ausTimeZone);
		System.out.println("Current Date and Time in Australia Time Zone: " + aus);

		ZoneId americaTimeZone = ZoneId.of("America/Marigot");
		ZonedDateTime lon = ZonedDateTime.now(americaTimeZone);
		System.out.println("Current Date and Time in America Time Zone: " + lon);

	}

}
