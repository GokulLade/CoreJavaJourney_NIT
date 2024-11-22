package com.nareshit.H_multithreading_in_java;

class MyThread6 extends Thread{
	
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Value is :"+i);
			try 
			{
				Thread.sleep(1000,10000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
	}
}

public class ThreadSleepMethodProgram03 {

	public static void main(String[] args) 
	{
		MyThread6 t=new MyThread6();
		t.start();

	}

}
