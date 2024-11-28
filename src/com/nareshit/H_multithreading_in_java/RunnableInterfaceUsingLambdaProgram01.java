package com.nareshit.H_multithreading_in_java;

public class RunnableInterfaceUsingLambdaProgram01 {

	public static void main(String[] args) 
	{
		Runnable r1=()->
		{
			String name=Thread.currentThread().getName();
			System.out.println("Current Thread is :"+name);
		};

		new Thread(r1,"Child-1").start();
	}

}
