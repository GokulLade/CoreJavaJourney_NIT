package com.nareshit.I_collection_framework_in_java.A_Cursors;

import java.util.List;
import java.util.Vector;

public class WaysToFetchCollectionObject {

	public static void main(String[] args) 
	{
		List<String> al= new Vector<String>();
		
		al.add("Apple");
		al.add("Banana");
		al.add("Mango");
		al.add("Orange");
		
		System.out.println("1. Using toString Method :");
		System.out.println(al.toString()); //Using toString()
		
		System.out.println();
		System.out.println("2. Using  Ordinary for Loop : ");
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i)+", ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("3. Using forEach Loop : ");
		for(String value:al)
		{
			System.out.print(value+", ");
		}

	}

}
