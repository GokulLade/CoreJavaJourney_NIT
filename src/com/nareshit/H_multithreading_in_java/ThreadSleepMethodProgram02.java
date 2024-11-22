package com.nareshit.H_multithreading_in_java;

class MyThread5 extends Thread{
	
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Value is :"+i);
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
	}
}

public class ThreadSleepMethodProgram02 {
	
	public static void main(String[] args) 
	{
		MyThread5 t1=new MyThread5();
		MyThread5 t2=new MyThread5();
		
		t1.start();
		t2.start();
	}
}




