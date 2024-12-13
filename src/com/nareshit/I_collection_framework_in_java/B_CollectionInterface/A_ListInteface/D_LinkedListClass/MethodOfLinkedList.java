package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface.D_LinkedListClass;

import java.util.LinkedList;

public class MethodOfLinkedList {

	public static void main(String[] args)
	{
		 LinkedList<String> list = new LinkedList<>();
         
         list.addFirst("Ravi");
         list.add("Rahul"); 
         list.addLast("Anand");	
         
         System.out.println(list.getFirst()); 
         System.out.println(list.getLast()); 
         
         list.removeFirst();
         list.removeLast(); 
         
         System.out.println(list); 

	}

}
