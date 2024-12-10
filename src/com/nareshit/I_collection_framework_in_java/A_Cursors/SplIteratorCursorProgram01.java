package com.nareshit.I_collection_framework_in_java.A_Cursors;

import java.util.List;
import java.util.Spliterator;
import java.util.Vector;

public class SplIteratorCursorProgram01 {

	
	public static void main(String[] args) 
	{
		List<String> al = new Vector<String>();

		al.add("Apple");
		al.add("Banana");
		al.add("Mango");
		al.add("Orange");
		
		Spliterator<String> sp= al.spliterator();
		
		sp.forEachRemaining(str->System.out.print(str+", "));

	}

}
