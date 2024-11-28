package com.nareshit.H_multithreading_in_java;

class ThreadName{
	
	public void threadName()
	{
		String name=Thread.currentThread().getName();
		
		System.out.println("Thread Name is :"+ name);
		
		synchronized(this)
		{
			for(int i=1;i<=9;i++)
			{
				System.out.println("Value is "+ i);
			}
		}
	}
}

public class BlockLevelSynchronizationProgram01 {

	public static void main(String[] args)
	{
		ThreadName tn=new ThreadName(); //lock-1 created
		
		Runnable r1=()->tn.threadName();
		Runnable r2=()->tn.threadName();
		
		Thread t1=new Thread(r1,"Child-1");
		Thread t2=new Thread(r2,"Child-2");
		
		t1.start();
		t2.start();

	}

}
