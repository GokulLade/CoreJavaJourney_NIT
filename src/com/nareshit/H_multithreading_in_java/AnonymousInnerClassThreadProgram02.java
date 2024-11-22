package com.nareshit.H_multithreading_in_java;

public class AnonymousInnerClassThreadProgram02 {

	public static void main(String[] args) 
	{
		new Thread() {
			
			@Override 
			public void run()
			{
				System.out.println(Thread.currentThread().getName());
			}
		}.start();
		
		new Thread() {

			@Override
			public void run() 
			{
				System.out.println(Thread.currentThread().getName());
			}
			
		}.start();

	}

}
