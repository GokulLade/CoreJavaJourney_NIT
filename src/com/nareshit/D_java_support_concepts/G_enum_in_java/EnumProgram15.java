package com.nareshit.D_java_support_concepts.G_enum_in_java;

public class EnumProgram15 {

	enum Day {
		
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	public static void main(String args[]) 
	{
		Day day = Day.MONDAY;

		switch (day)
		{
			case SUNDAY:
				System.out.println("Sunday");
				break;
				
			case MONDAY:
				System.out.println("My Monday");
				break;
				
			default:
				System.out.println("other day");
		}

	}

}
