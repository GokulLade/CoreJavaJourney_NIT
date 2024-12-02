package com.nareshit.H_multithreading_in_java;

class InterruptDemo2 extends Thread{
	
	@Override
	public void run()
	{
		Thread.currentThread().interrupt();
		
		try {
			
			for(int i=1;i<=10;i++)
			{
				System.out.println("I value is : "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Child thread completed...");
	}
}

public class InterruptMethodProgram02 {

	public static void main(String[] args) 
	{
		new InterruptDemo2().start();
	}

}
