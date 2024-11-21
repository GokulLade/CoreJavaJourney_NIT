package com.nareshit.H_multithreading_in_java;

class MyThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("My thread is Running...");
	}
}

public class IsAliveMethodProgarm01 {

	public static void main(String[] args) 
	{
		System.out.println("Main Method Started");
		MyThread t=new MyThread();
		System.out.println("My Thread is Started : "+t.isAlive());
		t.start();
		System.out.println("My Thread is Started : "+t.isAlive());
//		t.start(); restarting thread is not posiable in java -> java.lang.IllegalThreadStateException
		System.out.println("Main Method Ended");

	}

}
