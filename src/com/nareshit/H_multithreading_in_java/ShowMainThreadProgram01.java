package com.nareshit.H_multithreading_in_java;

public class ShowMainThreadProgram01 {

	public static void main(String[] args) 
	{
		String threadName=Thread.currentThread().getName();
		System.out.println("Current thread name is: "+threadName);

	}

}
