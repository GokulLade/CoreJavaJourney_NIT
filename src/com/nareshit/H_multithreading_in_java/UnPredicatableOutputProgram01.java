package com.nareshit.H_multithreading_in_java;

class MyThread1 extends Thread{
	
	public void run()
	{
		String name=Thread.currentThread().getName();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" Thread is :"+name);
		}
	}
	
}

public class UnPredicatableOutputProgram01 {

	public static void main(String[] args)
	{
		new MyThread1().start();
		String name=Thread.currentThread().getName();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" Thread is :"+name);
		}
	}

}
