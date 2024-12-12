package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface.C_ArrayListClass;

import java.util.ArrayList;
import java.util.ListIterator;

public class FetchingElementsInForwardAndBackwardDirectionProgram01 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> numbers =new ArrayList<Integer>();
		for(int i=1;i<=10;i++) numbers.add(i);
		
		System.out.println("Fetching Elements in Forward direction: ");
		ListIterator<Integer> ls=numbers.listIterator();
		
		while(ls.hasNext())
		{
			System.out.print(ls.next()+", ");
		}
		System.out.println();
		
		System.out.println("Fetching Elements in Backward direction: ");
		
		while(ls.hasPrevious())
		{
			System.out.print(ls.previous()+", ");
		}
	}

}
