package com.nareshit.I_collection_framework_in_java.A_Cursors;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class IteratorCursorProgram01 {

	public static void main(String[] args) 
	{
		List<String> al=new Vector<String>();
		al.add("Hyderabad");
		al.add("Pune");
		al.add("Mumbai");
		al.add("Delhi");
		al.add("Washim");
		
		Iterator<String> it=al.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+", ");
		}

	}

}
