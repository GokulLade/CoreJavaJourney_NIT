package com.nareshit.H_multithreading_in_java;

public class DeadlockStateProgram01 {

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Main thread Started..");
		
		Thread t1=Thread.currentThread();
		String threadName=Thread.currentThread().getName();
		for(int i=1; i<=10; i++)
		{
			System.out.println("i value is :"+i+" by "+threadName);
			Thread.sleep(500);
		}
		t1.join();
		
		System.out.println("Main Thread Ended..!");
	}

}
