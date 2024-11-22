package com.nareshit.H_multithreading_in_java;

class Sleep extends Thread{
	
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

public class ThreadSleepMethodProgram01 {

	public static void main(String[] args)
	{
		Sleep s1=new Sleep();
		s1.start();
		
	}

}
