package com.nareshit.H_multithreading_in_java;

class MyThread4 extends Thread{
	
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" Thread is running..");
	}
}

public class UserDefinedThreadNameProgram01 {

	public static void main(String[] args) 
	{
		Thread t=Thread.currentThread();
		t.setName("Parent"); //Set name for main thread
		
		MyThread4 t1=new MyThread4();
		MyThread4 t2=new MyThread4();
		
		t1.setName("Child-1");
		t2.setName("Child-2");
		
		t1.start();
		t2.start();
		
		System.out.println(Thread.currentThread().getName()+" Thread is running...");

	}

}
