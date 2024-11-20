package com.nareshit.H_multithreading_in_java;

class UserThread1 extends Thread{
	
	@Override
	public void run()
	{
		System.out.println("User Defined Thread");
	}
}

public class UserThreadUsingThreadClass {

	public static void main(String[] args)
	{
		System.out.println("Main method started");
		UserThread1 t1=new UserThread1();
		t1.start();
		System.out.println("Main method Ended");

	}

}
