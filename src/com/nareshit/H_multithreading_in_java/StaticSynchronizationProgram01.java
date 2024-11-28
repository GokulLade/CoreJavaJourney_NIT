package com.nareshit.H_multithreading_in_java;

//Static Method level Synchronized
class MyTableMethod{
	
	public static synchronized void printTable(int num)
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+(num*i));
		}
	}
}

// Static Block level Synchronized
class MyTableBlock{
	
	public static void printTable(int num)
	{
		String name=Thread.currentThread().getName();
		System.out.println("Thread name is :"+name);
		
		synchronized(MyTableBlock.class)
		{

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			for(int i=1;i<=10;i++)
			{
				System.out.println(num+" * "+i+" = "+(num*i));
			}
		}
	}
}
public class StaticSynchronizationProgram01 {

	public static void main(String[] args)
	{
		Thread t1=new Thread(()->MyTableMethod.printTable(5),"child-1");
		Thread t2=new Thread(()->MyTableMethod.printTable(10),"child-2");
		
//		Thread t3=new Thread(()->MyTableBlock.printTable(5),"child-1");
//		Thread t4=new Thread(()->MyTableBlock.printTable(10),"child-2");
		
		t1.start();
		t2.start();
//		t3.start();
//		t4.start();
	}

}
