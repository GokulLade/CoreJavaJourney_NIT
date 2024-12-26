package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.C_QueueInterface.A_PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueMethodsProgram {

	public static void main(String[] args) 
	{
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("2");
		pq.add("4");
		pq.add("6");
		System.out.print(pq.peek() + " ");//[2]
		pq.offer("1");
		pq.offer("9");
		pq.add("3");

		pq.remove("1");
		System.out.print(pq.poll() + " ");//[2]
		if (pq.remove("2"))
			System.out.print(pq.poll() + " ");
		System.out.println(pq.poll() + " " + pq.peek() + "  " + pq.poll());//[3,4,4]

	}

}
