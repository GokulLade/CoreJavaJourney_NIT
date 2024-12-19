package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.B_SetInterface.D_TreeSetClass;

import java.util.TreeSet;

public class PassingComparatorIntoConstructor {

	public static void main(String[] args) 
	{
		TreeSet<Integer> t=new TreeSet<>((i1,i2)->i2.compareTo(i1));
		t.add(30);
		t.add(55);
		t.add(20);
		t.add(66);
		t.add(74);
		
		t.forEach(System.out::println);
	}

}
