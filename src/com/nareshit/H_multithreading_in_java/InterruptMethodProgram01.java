package com.nareshit.H_multithreading_in_java;

class InterruptDemo1 extends Thread{
	
	@Override
	public void run()
	{
		Thread t=Thread.currentThread();
		System.out.println(t.isInterrupted());
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Value : "+i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("Thread is Interrupted..");
				e.printStackTrace();
			}
		}
	}
	
}

public class InterruptMethodProgram01 {

	public static void main(String[] args) 
	{
		InterruptDemo1 td=new InterruptDemo1();
		
		System.out.println(td.getState());
		
		td.start();
		
		td.interrupt();
	}

}
