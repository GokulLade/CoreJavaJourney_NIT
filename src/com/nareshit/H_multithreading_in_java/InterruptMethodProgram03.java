package com.nareshit.H_multithreading_in_java;

class InterruptDemo3 implements Runnable{
	
	@Override
	public void run()
	{
		try
		{
			while(!Thread.currentThread().isInterrupted())
			{
				System.out.println("Thread is running by locking the resource");
				Thread.sleep(500);
			}
		}
		catch (InterruptedException e)
		{
			System.out.println("Thread interrupted gracefully.");
		}
		finally
		{
			System.out.println("Thread resource can be release here.");
		}
	}

}

public class InterruptMethodProgram03 {
	
	public static void main(String[] args)
	{
		Thread thread = new Thread(new InterruptDemo3());
		thread.start();
		
		try
		{
			Thread.sleep(3000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		thread.interrupt();
	}
}