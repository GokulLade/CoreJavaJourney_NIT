package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface.D_LinkedListClass;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListWithDeque {

	public static void main(String[] args) 
	{
		// Create a LinkedList and treat it as a Deque
        Deque<String> deque = new LinkedList<>();

        
        deque.addFirst("Ravi");  
        deque.addFirst("Raj");   

        
        deque.addLast("Pallavi");   
        deque.addLast("Sweta");

        
        System.out.println("Deque: " + deque);   

       
        String first = deque.removeFirst();
        String last = deque.removeLast();

       
        System.out.println("Removed first element: " + first);
        System.out.println("Removed last element: " + last);
        System.out.println("Updated Deque: " + deque);


	}

}
