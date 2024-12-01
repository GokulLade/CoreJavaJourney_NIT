package com.nareshit.H_multithreading_in_java;

public class DaemonThreadProgram01 
{
  public static void main(String[] args) 
	{
	    System.out.println("Main Thread Started...");

        Thread daemonThread = new Thread(() -> 
		{
            while (true) 
			{
                System.out.println("Daemon Thread is running...");
                try 
				{
                    Thread.sleep(1000);
                } 
				catch (InterruptedException e) 
				{
                    e.printStackTrace();
                }
            }
        });

        daemonThread.setDaemon(true); 
        daemonThread.start();

        
        Thread userThread = new Thread(() -> 
		{
            for (int i=1; i<=10; i++) 
			{
                System.out.println("User Thread: " + i);
                try 
				{
                    Thread.sleep(2000);
                } 
				catch (InterruptedException e) 
				{
                    e.printStackTrace();
                }
            }
        });

        userThread.start();

        System.out.println("Main Thread Ended...");
    }
}