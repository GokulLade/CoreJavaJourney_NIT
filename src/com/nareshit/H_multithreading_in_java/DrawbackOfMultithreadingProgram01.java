package com.nareshit.H_multithreading_in_java;

class Customer implements Runnable{

	private int availableSeat=1;
	public int wantedSeat;
	
	public Customer(int wantedSeat)
	{
		this.wantedSeat=wantedSeat;
	}
	
	@Override
	public void run() 
	{
		String name=null;
		
		if(availableSeat>=wantedSeat)
		{
			name=Thread.currentThread().getName();
			System.out.println(wantedSeat+" Seat is Booked for "+name);
			availableSeat-=wantedSeat;
		}
		else
		{
			name=Thread.currentThread().getName();
			System.out.println("Sorry "+name+" site is not Available");
		}
		
	}
	
}

public class DrawbackOfMultithreadingProgram01 {

	public static void main(String[] args) 
	{
		Customer c=new Customer(1);
		
		Thread t1=new Thread(c,"Gokul");
		Thread t2=new Thread(c,"Ganesh");
		t1.start();
		t2.start();
	}
}
