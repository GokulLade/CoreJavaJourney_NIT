package com.nareshit.H_multithreading_in_java;

class MyThread3 extends Thread{
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("Child Thread is Running..");
	}
	
}

public class DefaultThreadNameProgram01 {

	public static void main(String[] args) 
	{
		MyThread3 t1=new MyThread3();
		t1.start();
		
		MyThread3 t2=new MyThread3();
		t2.start();
		
		System.out.println(Thread.currentThread().getName());
		

	}

}
