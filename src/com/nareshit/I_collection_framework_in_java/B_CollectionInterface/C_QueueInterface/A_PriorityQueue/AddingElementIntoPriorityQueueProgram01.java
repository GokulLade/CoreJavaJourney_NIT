package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.C_QueueInterface.A_PriorityQueue;

import java.util.PriorityQueue;

public class AddingElementIntoPriorityQueueProgram01 {

	public static void main(String[] args) 
	{
		PriorityQueue<Object> pq = new PriorityQueue<>();
		pq.add("Orange");
		pq.add("Apple");
		pq.add("Mango");
		pq.add("Guava");
		pq.add("Grapes");
		// pq.add(null); Inavlid
		// pq.add(23); Invalid

		System.out.println(pq);//[Apple, Grapes, Mango, Orange, Guava]

	}

}
