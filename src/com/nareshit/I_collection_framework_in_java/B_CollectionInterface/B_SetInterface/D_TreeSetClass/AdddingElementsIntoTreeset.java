package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.B_SetInterface.D_TreeSetClass;

//Program that describes by default TreeSet provides default natural sorting order
import java.util.TreeSet;

public class AdddingElementsIntoTreeset {

	public static void main(String[] args) 
	{
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(20);
		ts.add(10);
		ts.add(25);
		ts.add(65);
		
		System.out.println(ts);
	}

}
