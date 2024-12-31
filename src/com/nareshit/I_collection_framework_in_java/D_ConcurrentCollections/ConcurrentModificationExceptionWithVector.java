package com.nareshit.I_collection_framework_in_java.D_ConcurrentCollections;

import java.util.Iterator;
import java.util.Vector;

class Concurrent1 extends Thread
{
	private Vector<String> languages = null;	
	
	public Concurrent1(Vector<String> languages) 
	{
		super();
		this.languages = languages;
	}

	@Override
	public void run()
	{
		try
		{
			Thread.sleep(2500);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		languages.add("Pascal");
	}
}


public class ConcurrentModificationExceptionWithVector {
	
	public static void main(String[] args) throws InterruptedException 
	{
		Vector<String> listOfLanguage = new Vector<>();
		listOfLanguage.add("Java");
		listOfLanguage.add("C++");
		listOfLanguage.add("C");
		listOfLanguage.add("Spring");
		listOfLanguage.add("Adv Java");
		
		Concurrent1 concurrent = new Concurrent1(listOfLanguage);
		concurrent.start();
		
		Iterator<String> iterator = listOfLanguage.iterator();
		
		while(iterator.hasNext())
		{
			Thread.sleep(500);
			System.out.println(iterator.next());
		}
		
	}


}
