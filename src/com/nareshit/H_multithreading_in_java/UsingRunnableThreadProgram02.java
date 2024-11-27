package com.nareshit.H_multithreading_in_java;

class PlacementBatch implements Runnable{

	@Override
	public void run() 
	{
		String name=Thread.currentThread().getName();
		System.out.println(name);
	}
	
}

class RegularBatch implements Runnable{

	@Override
	public void run() 
	{
		String name=Thread.currentThread().getName();
		System.out.println(name);
	}
	
}

public class UsingRunnableThreadProgram02 {

	public static void main(String[] args)
	{
		Thread t1=new Thread(new PlacementBatch(),"Placement Batch");
		t1.start();
		
		Thread t2=new Thread(new PlacementBatch(),"Regular Batch");
		t2.start();
	}

}
