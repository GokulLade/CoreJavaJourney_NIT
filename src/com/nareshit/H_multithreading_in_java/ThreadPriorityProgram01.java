package com.nareshit.H_multithreading_in_java;

public class ThreadPriorityProgram01 {

	public static void main(String[] args)
	{
		Thread t=Thread.currentThread();
		t.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(t.getName()+" Priority is = "+t.getPriority());
		
		Thread t1=new Thread();
		System.out.println(t1.getName()+" Priority is = "+t1.getPriority());

	}

}
