package com.nareshit.D_java_support_concepts.G_enum_in_java;

enum Season
{
	WINTER, SUMMER, SPRING, RAINY, FALL;   //All are object of type enum
	 
	private Season()
	{
		System.out.println("Constructor is executed....");
	}	
}
public class EnumProgram12 
{
	public static void main(String[] args) 
	{
		System.out.println(Season.WINTER);
		System.out.println(Season.SUMMER);
		
	}
}
