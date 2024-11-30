package com.nareshit.H_multithreading_in_java;


class BankCustomer{
	
	private int balance=10000;
	
	public synchronized void  withdraw(int amount)
	{
		if(amount>balance)
		{
			System.out.println("Balance is insufficient wait for deposit");
			
			try 
			{
				wait();
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
			System.out.println(balance+" is withdraw");
		}
		
		balance-=amount;
		System.out.println("Current balance is "+balance);
	}
	
	public synchronized void deposit(int amount)
	{
		System.out.println(amount+" Amount is Deposit");
		balance+=amount;
		notify();
	}
}

public class ITCProgram02{
	
	public static void main(String[] args)
	{

		BankCustomer bc=new BankCustomer();
		
		Thread son=new Thread()
		{
			@Override
			public void run()
			{
				bc.withdraw(20000);
			}
		};
		
		son.start();
		
		Thread father=new Thread()
		{
			@Override
			public void run()
			{
				bc.deposit(10000);
			}
		};
		
		father.start();
		
	}

	
}