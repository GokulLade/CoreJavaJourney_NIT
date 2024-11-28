package com.nareshit.H_multithreading_in_java;

class Table1{
	
	public synchronized void printTable(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+(num*i));
			
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

public class ProblemWithObjectLevelSynchronizationProgram01 {

	public static void main(String[] args) 
	{
		Table1 tb1=new Table1(); //lock-1
		Table1 tb2=new Table1(); //lock-2
		
		Thread t1=new Thread()
		{
			@Override
			public void run()
			{
				tb1.printTable(5); //lock-1
			}
		};
		Thread t2=new Thread()
		{
			@Override
			public void run()
			{
				tb1.printTable(10); //lock-1
			}
		};
		
		Thread t3=new Thread()
		{
			@Override
			public void run()
			{
				tb2.printTable(15); //lock-2
			}
		};
		Thread t4=new Thread()
		{
			@Override
			public void run()
			{
				tb2.printTable(20); //lock-2
			}
		};
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
