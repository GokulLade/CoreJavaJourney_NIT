package com.nareshit.H_multithreading_in_java;

public class AnonymouseInnerWithRunnableProgram01 {

	public static void main(String[] args)
	{
		Runnable r1=new Runnable(){
			
			@Override
			public void run() 
			{
				String name=Thread.currentThread().getName();
				System.out.println("Thread Name is: "+name);
				
			}
		};
		
		Thread t1=new Thread(r1,"Child-1");
		t1.start();

	}

}
