package com.nareshit.H_multithreading_in_java;

class Print extends Thread {
	
	private int val=0;
	
	public void run()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0;i<=10;i++)
		{
			val+=i;
		}
	}
	
	public int getValue()
	{
		return val;
	}
}

public class WithoutUsingITCProgram01 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Main method Started..");
		Print p=new Print();
		p.start();
		
		Thread.sleep(1000);
		
		System.out.println(p.getValue());

		System.out.println("Main method Ended..");
	}

}
