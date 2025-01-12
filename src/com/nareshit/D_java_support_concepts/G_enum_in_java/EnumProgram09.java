package com.nareshit.D_java_support_concepts.G_enum_in_java;

//ordinal() to find out the order position

public class EnumProgram09
{
	static enum Season   
	{
		SPRING, SUMMER, WINTER, FALL, RAINY
	}
	
	public static void main(String[] args) 
	{
		Season seasons[] = Season.values();
		
		for(Season season : seasons)
		{
			System.out.println(season.name()+" order position is :"+season.ordinal());
		}		
	}
}

