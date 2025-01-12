package com.nareshit.D_java_support_concepts.G_enum_in_java;

enum Month 
{
	JANUARY,FEBRUARY,MARCH 
} 
public class EnumProgram03
{
	enum Color { RED,BLUE,BLACK }   

    public static void main(String[] args) 
	{
		enum Week {SUNDAY, MONDAY, TUESDAY }
		
		System.out.println(Month.FEBRUARY);
		System.out.println(Color.RED);
		System.out.println(Week.SUNDAY);
	}
}
