package com.nareshit.I_collection_framework_in_java.C_MapInterface.A_HashMapClass;

import java.util.Scanner;

public class GenerateCustomHashCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String.");
		String value = sc.next();

		System.out.println(value.hashCode());

		// Custome hash code
		System.out.println(hashCode(value));

	}

	
	// Finding the user defined hashcode value
	public static int hashCode(String str) 
	{
		int hashcode = 0;

		if (str == null) 
		{
			hashcode = 0;// defualt hashCode value for null is 0
		}
		for (int i = 0; i < str.length(); i++) 
		{
		
			char value=str.charAt(i);
			hashcode=31*hashcode+value; 
		}
		
		return hashcode;
	}

}
