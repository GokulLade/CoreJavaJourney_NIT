package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.B_SetInterface.C_SortedSetInterface;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceSortMethod {

	public static void main(String[] args) 
	{
		List<String> names=new ArrayList<>();
		
		names.add("Rahul");
		names.add("Om");
		names.add("Shyam");
		names.add("Ram");
		names.add("Akash");
		
		names.sort((s1,s2)-> s1.compareTo(s2));
		
		names.forEach(System.out::println);

	}

}
