package com.nareshit.I_collection_framework_in_java.D_ConcurrentCollections;

import java.util.ArrayList;
import java.util.Iterator;

class Concurrent extends Thread
{
	private ArrayList<String> languages = null;	
	
	public Concurrent(ArrayList<String> languages) 
	{
		this.languages = languages;
	}

	@Override
	public void run()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		languages.add("Pascal");
	}
}


public class ConcurrentModificationExceptionWithArrayList {

	public static void main(String[] args) throws InterruptedException 
	{
		ArrayList<String> listOfLanguage = new ArrayList<>();
		listOfLanguage.add("Java");
		listOfLanguage.add("C++");
		listOfLanguage.add("C");
		listOfLanguage.add("Spring");
		listOfLanguage.add("Adv Java");
		
		Concurrent concurrent = new Concurrent(listOfLanguage);
		concurrent.start();
		
		Iterator<String> iterator = listOfLanguage.iterator();
		
		while(iterator.hasNext())
		{
			Thread.sleep(500);
			System.out.println(iterator.next());
		}
	}

}
