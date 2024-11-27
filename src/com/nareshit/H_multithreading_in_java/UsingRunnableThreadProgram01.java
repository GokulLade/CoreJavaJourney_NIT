package com.nareshit.H_multithreading_in_java;

class MyThread7 implements Runnable{

	@Override
	public void run()
	{
		String name=Thread.currentThread().getName();
		System.out.println("Thread Name is:"+name);
	}
	
}

public class UsingRunnableThreadProgram01 {

	public static void main(String[] args)
	{
		MyThread7 r1=new MyThread7();
		
		Thread t1=new Thread(r1,"Child-1");
		t1.start();
		
	}

}
