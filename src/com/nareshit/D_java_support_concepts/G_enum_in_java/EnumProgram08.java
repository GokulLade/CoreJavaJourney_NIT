package com.nareshit.D_java_support_concepts.G_enum_in_java;

//values() to get all the values of enum

public class EnumProgram08 
{
	enum Season   
	{
	SPRING, SUMMER, WINTER, FALL, RAINY
	}

	public static void main(String[] args) 
	{
		Season[] seasons = Season.values();
		
		for(Season season : seasons)
		{
			System.out.println(season);
		}

	}
}
