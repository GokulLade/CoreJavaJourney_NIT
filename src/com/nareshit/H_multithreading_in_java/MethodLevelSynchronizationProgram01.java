package com.nareshit.H_multithreading_in_java;

//Program on Method Level Synchronization
class Table{
	
	public synchronized void printTable(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+(num*i));
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		System.out.println("-------------------------");
	}
}

public class MethodLevelSynchronizationProgram01 {

	public static void main(String[] args)
	{
		Table t=new Table(); //lock-1 created
		
		Runnable r1=()->t.printTable(5);
		Runnable r2=()->t.printTable(10);
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
		

	}

}
