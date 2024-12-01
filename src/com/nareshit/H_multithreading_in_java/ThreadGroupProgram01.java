package com.nareshit.H_multithreading_in_java;

class Foo implements Runnable
{
	@Override
	public void run() 
	{
		String name = Thread.currentThread().getName();
		for(int i =1; i<3; i++)
		{
			System.out.println(i+" by "+name+ " thread");
			
		}
	}	
}

public class ThreadGroupProgram01 
{
  public static void main(String[] args) throws InterruptedException 
  {
	 ThreadGroup tg = new ThreadGroup("NIT_Thread");
	 

	 Thread t1 = new Thread(tg, new Foo(), "Child1");
	 Thread t2 = new Thread(tg, new Foo(), "Child2");
	 Thread t3 = new Thread(tg, new Foo(), "Child3");
	 Thread t4 = new Thread(tg, new Foo(), "Child4");
	 
	 t1.start();  t2.start(); t3.start(); t4.start();
	 
	 
	 System.out.println("Thread Group Name :"+tg.getName());
	 System.out.println("Active threads are :"+tg.activeCount());
	 
  }
}
