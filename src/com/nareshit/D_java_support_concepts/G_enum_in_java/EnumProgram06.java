package com.nareshit.D_java_support_concepts.G_enum_in_java;

class Hello
{
	int x = 100;
}

enum Direction //extends Hello
{
	EAST, WEST, NORTH, SOUTH;

	
}

public class EnumProgram06 
{
	public static void main(String[] args) 
	{
		System.out.println(Direction.SOUTH);
	}
}