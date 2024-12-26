package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.C_QueueInterface.A_PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

record Task(String name, int priority) {
	
}

public class SortingCustomerObjectUsingComparator {
	
	public static void main(String[] args) 
	{
		PriorityQueue<Task> taskQueue = new PriorityQueue<>(
		new Comparator<Task>(){
			@Override
			public int compare(Task t1, Task t2) {
				return Integer.compare(t1.priority(), t2.priority());
			}
		});

		taskQueue.add(new Task("Submit report", 4));
		taskQueue.add(new Task("Find Bug", 2));
		taskQueue.add(new Task("Write Program", 1));
		taskQueue.add(new Task("Execute Program", 3));

		while (!taskQueue.isEmpty()) {
			System.out.println("Executing: " + taskQueue.poll());
		}
	}
}
