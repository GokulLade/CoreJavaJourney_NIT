package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.B_SetInterface.D_TreeSetClass;

import java.util.Iterator;
import java.util.TreeSet;

public class SortingInDescendingOrder {

	public static void main(String[] args) 
	{
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Orange");
		ts.add("Banana");
		ts.add("Apple");
		ts.add("Mango");
		ts.add("Pear");
		
		System.out.println("In Ascending Order: ");
		ts.forEach(System.out::println);
		System.out.println();
		
		System.out.println("In Descending Order: ");
		Iterator<String> it=ts.descendingIterator();
		
		it.forEachRemaining(x->System.out.println(x));

	}

}
