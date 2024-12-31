package com.nareshit.I_collection_framework_in_java.D_ConcurrentCollections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetProgram01 {

	public static void main(String[] args) 
	{
		CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();

        set.add("Java");
        set.add("Python");
        set.add("C++");
		set.add("Java");

        Iterator<String> itr = set.iterator();
		

        // Adding a new element
        set.add("JavaScript");
       
        for (String language : set) 
		{
            System.out.println(language);
        }
		
		System.out.println("............");
		while(itr.hasNext())
	    {
			System.out.println(itr.next());
	    }


	}

}
