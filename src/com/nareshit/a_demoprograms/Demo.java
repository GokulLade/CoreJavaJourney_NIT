package com.nareshit.a_demoprograms;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class Demo {

	public static void main(String[] args) 
	{
		LocalDate d=LocalDate.now();
		System.out.println(d);
		
		LocalTime t= LocalTime.now();
		System.out.println(t);
		
		LocalDateTime dt= LocalDateTime.now();
		System.out.println(dt);
		
		ZonedDateTime z=ZonedDateTime.now();
		System.out.println(z);
		
		ZoneId zone=z.getZone();
//		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//		availableZoneIds.forEach(System.out::println);
		
		ZoneId newZone = ZoneId.of("America/Managua");
		System.out.println(newZone.getId());
		
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd");
		System.out.println(df);
	}

}