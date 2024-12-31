package com.nareshit.I_collection_framework_in_java.D_ConcurrentCollections;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetProgram02 {

	public static void main(String[] args) 
	{
		CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        
        System.out.println("Is element contains: "+set.contains(1));
        
        System.out.println("Is set empty: "+set.isEmpty());
        
        System.out.println("remove element from set: "+set.remove(3));
        
        System.out.println("Element from Set: "+ set);


	}

}
