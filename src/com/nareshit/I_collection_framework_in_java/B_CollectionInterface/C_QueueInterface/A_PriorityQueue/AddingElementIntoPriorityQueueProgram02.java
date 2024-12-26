package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.C_QueueInterface.A_PriorityQueue;

import java.util.PriorityQueue;

public class AddingElementIntoPriorityQueueProgram02 {

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(11);
		pq.add(2);
		pq.add(4);
		pq.add(6);
		System.out.println(pq);//[2,6,4,11]

	}

}
