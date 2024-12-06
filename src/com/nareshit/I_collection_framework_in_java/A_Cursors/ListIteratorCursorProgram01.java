package com.nareshit.I_collection_framework_in_java.A_Cursors;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorCursorProgram01 {

	public static void main(String[] args) 
	{
		List<String> al=new Vector<String>();
		al.add("Hyderabad");
		al.add("Pune");
		al.add("Mumbai");
		al.add("Delhi");
		al.add("Washim");
		
		ListIterator<String> lstit=al.listIterator();
		
		System.out.println("1.Forward direction: ");
		while(lstit.hasNext())
		{
			System.out.print(lstit.next()+", ");
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("2.Backward direction: ");
		while(lstit.hasPrevious())
		{
			System.out.print(lstit.previous()+", ");
		}

	}

}
