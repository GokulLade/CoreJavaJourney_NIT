package com.nareshit.I_collection_framework_in_java.D_ConcurrentCollections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Spliterator;

public class CollectionsSynchronizedSetMethod {

	public static void main(String[] args) 
	{
		Set<String> set = Collections.synchronizedSet(new HashSet<>());  
        set.add("Apple");   
		set.add("Orange");
		set.add("Grapes");
		set.add("Mango");
		set.add("Guava");
		set.add("Mango");           
        System.out.println("Set after Synchronization :");  
        synchronized (set) 
		{  
           Spliterator<String> itr = set.spliterator();
		   itr.forEachRemaining(str -> System.out.println(str));  
         }       


	}

}
