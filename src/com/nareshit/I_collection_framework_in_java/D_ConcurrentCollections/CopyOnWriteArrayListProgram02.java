package com.nareshit.I_collection_framework_in_java.D_ConcurrentCollections;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.concurrent.CopyOnWriteArrayList;

class ConcurrentModification extends Thread
{
	CopyOnWriteArrayList<String> al = null;
	public ConcurrentModification(CopyOnWriteArrayList<String> al)
	{
		this.al = al;
	}
	@Override
	public void run()
	{			
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
		}
	    al.add("KIWI");
	}
}
public class CopyOnWriteArrayListProgram02 
{
	public static void main(String[] args) throws InterruptedException
	{
		CopyOnWriteArrayList<String> arl = new CopyOnWriteArrayList<>();
		arl.add("Apple");   
		arl.add("Orange");
		arl.add("Grapes");
		arl.add("Mango");
		arl.add("Guava");
		ConcurrentModification cm = new ConcurrentModification(arl);
		cm.start();
			
		Iterator<String> itr = arl.iterator();
        while(itr.hasNext())
		{
			String str = itr.next();
			System.out.println(str);
			Thread.sleep(500);
		}

	    System.out.println("............");

		Spliterator<String> spl =  arl.spliterator();
		spl.forEachRemaining(x -> System.out.println(x));
	}
}
