package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface.D_LinkedListClass;

import java.util.Iterator;
import java.util.LinkedList;

public class AddingAndFetchingElementsInLikedList {

	public static void main(String[] args) 
	{
		LinkedList<Object> list = new LinkedList<>();
		
		list.add(10);
		list.add("Gokul");
		list.add(null);
		list.add('G');
		
		System.out.println("First Elements is :"+list.get(0));
		
		//Iterator
		Iterator<Object> it=list.iterator();
		
		while(it.hasNext()) System.out.print(it.next()+", ");
	}

}
