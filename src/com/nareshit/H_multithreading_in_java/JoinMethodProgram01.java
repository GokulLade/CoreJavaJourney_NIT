package com.nareshit.H_multithreading_in_java;

class Join extends Thread{
	
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Value i is :"+i);
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

public class JoinMethodProgram01 {

	public static void main(String[] args) throws InterruptedException 
	{
		Join j1=new Join();
		Join j2=new Join();
		Join j3=new Join();
		
		j1.start();
		j1.join();
		
		j2.start();
		j3.start();

	}

}
