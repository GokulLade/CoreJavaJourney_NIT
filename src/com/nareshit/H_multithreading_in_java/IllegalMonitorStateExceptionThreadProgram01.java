package com.nareshit.H_multithreading_in_java;

public class IllegalMonitorStateExceptionThreadProgram01 {

	public static void main(String[] args) throws InterruptedException 
	{
		Object obj= new Object();
		obj.wait();
	}

}
