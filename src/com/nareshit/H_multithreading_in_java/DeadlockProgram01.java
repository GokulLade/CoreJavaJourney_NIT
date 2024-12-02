package com.nareshit.H_multithreading_in_java;

public class DeadlockProgram01 {

	public static void main(String[] args) 
	{
		String resource1="Hyderabad";
		String resource2="Pune";
		
		// t1 tries to lock resource1 want resource2
		Thread t1=new Thread() 
		{
			@Override
			public void run()
			{
				synchronized(resource1)
				{
					System.out.println("Thread 1 : locked resource 1");
					
					try 
					{
						Thread.sleep(1000);
					} 
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
					
					synchronized(resource2)
					{
						System.out.println("Thread 1 : Locked resource 2");
					}
				}
			}
		};
		
		// t2 tries to lock resource2 want resource1
		Thread t2=new Thread()
		{
			@Override
			public void run()
			{
				synchronized(resource2)
				{
					System.out.println("Thread 2 : locked resource 2");
					
					try 
					{
						Thread.sleep(1000);
					} 
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
					
					synchronized(resource1)
					{
						System.out.println("Thread 2 : Locked resource 1");
					}
				}
			}
		};

		t1.start();
		t2.start();
	}

}
