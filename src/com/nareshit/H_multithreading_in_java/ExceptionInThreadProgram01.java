package com.nareshit.H_multithreading_in_java;

class MyThread2 extends Thread{
	
	@Override
	public void run()
	{
		System.out.println("Child Thread is Running....");
	}
}

public class ExceptionInThreadProgram01 {

	public static void main(String[] args) 
	{
		System.out.println("Main methods Started");
		
		MyThread2 t1=new MyThread2();
		t1.start();
		
		MyThread2 t2=new MyThread2();
		t2.start();
		
		System.out.println(10/0);
		
		System.out.println("Main methods Started");
	}

}
