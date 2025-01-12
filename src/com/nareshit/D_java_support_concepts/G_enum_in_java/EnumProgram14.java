package com.nareshit.D_java_support_concepts.G_enum_in_java;

import java.util.Scanner;

enum Color
{
	
	RED, BLUE, PINK
}

public class EnumProgram14 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Color Name :");
		String colorName = sc.next();
		
		Color color = Color.valueOf(colorName);
        System.out.println(color);	
        sc.close();
	}

}
