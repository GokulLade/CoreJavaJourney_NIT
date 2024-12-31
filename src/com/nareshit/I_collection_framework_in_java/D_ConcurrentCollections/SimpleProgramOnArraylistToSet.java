package com.nareshit.I_collection_framework_in_java.D_ConcurrentCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SimpleProgramOnArraylistToSet {

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(50);
		System.out.println("Arraylist Elements : " + al);
		Set s = new HashSet(al);
		System.out.println("Set Elements are: " + s);

	}

}
