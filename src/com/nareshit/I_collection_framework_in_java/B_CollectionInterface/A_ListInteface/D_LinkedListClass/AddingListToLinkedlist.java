package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface.D_LinkedListClass;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AddingListToLinkedlist {

	public static void main(String[] args) 
	{
		List<String> names=Arrays.asList("Gokul","Ganesh","Rushi");
		
		LinkedList<String> list=new LinkedList<String>(names);
		list.forEach(System.out::println);

	}

}
