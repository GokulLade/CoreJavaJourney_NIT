package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface.D_LinkedListClass;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

record Dog(String name)
{
	
}

public class CustomObjectIntoLinkedList {

	public static void main(String[] args)
	{
		 List<Dog> list = new LinkedList<>();
		 
         Dog dog = new Dog("Tiger");
         list.add(dog);
         list.add(new Dog("Tommy"));
         list.add(new Dog("Rocky"));

        Iterator<Dog> i3 = list.iterator();
	    i3.forEachRemaining(x -> System.out.println(x.name().toUpperCase()));    


         System.out.println("size " + list.size());
         System.out.println("Get 1st Position Object " + list.get(1).name());


	}

}
