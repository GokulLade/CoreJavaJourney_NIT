package com.nareshit.H_multithreading_in_java;

class Customer01{
	
	private double curruntBalance=2000;
	private double withdrawAmount;
	
	public Customer01(double withdrawAmount)
	{
		this.withdrawAmount=withdrawAmount;
	}
	
	public void withdrawAmount()
	{
		String name=null;
		
		if(curruntBalance>=withdrawAmount)
		{
			name=Thread.currentThread().getName();
			System.out.println(withdrawAmount+" Amount withdraw by "+ name);
		}
		else
		{
			name=Thread.currentThread().getName();
			System.out.println("Sorry "+ name+" You have insufficient balance");
		}
	}
	
}

public class DrawbackOfMultithreadingProgram02 {

	public static void main(String[] args) 
	{
		Customer01 c=new Customer01(2000);
		
		Runnable r1=()->c.withdrawAmount();
		
		Thread t1=new Thread(r1,"Gokul");
		Thread t2=new Thread(r1,"Ganesh");
		
		t1.start();
		t2.start();

	}

}
