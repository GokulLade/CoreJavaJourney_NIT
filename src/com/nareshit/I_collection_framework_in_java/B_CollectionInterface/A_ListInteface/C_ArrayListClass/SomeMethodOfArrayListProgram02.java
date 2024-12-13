package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface.C_ArrayListClass;

import java.util.ArrayList;

public class SomeMethodOfArrayListProgram02 {

	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>(100); 
        list.add("Java");
        list.add("World");
        
        //public void trimToSize()
        list.trimToSize();
        System.out.println("Trimmed List Size: " + list.size()); 
        
        System.out.println(".........................");
        
        
        ArrayList<Integer> listOfNumber = new ArrayList<>();

        // public void ensureCapacity(int minCapacity)
        //Increase the capacity of the ArrayList to avoid frequent resizing.
        listOfNumber.ensureCapacity(100);

        for (int i = 0; i < 50; i++) 
        {
        	listOfNumber.add(i);
        }

        System.out.println("List size: " + listOfNumber.size());
           


	}

}
