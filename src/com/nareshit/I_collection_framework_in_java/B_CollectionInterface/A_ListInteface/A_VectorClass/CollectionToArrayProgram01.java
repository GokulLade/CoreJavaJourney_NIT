package com.nareshit.I_collection_framework_in_java.B_CollectionInterface.A_ListInteface.A_VectorClass;

import java.util.Collections;
import java.util.Vector;

public class CollectionToArrayProgram01 {

	public static void main(String[] args)
	{
		Vector<Integer> v=new Vector<>();
		
		for(int i=1;i<=10;i++)
		{
			v.add(i);
		}
		System.out.println(v);
		
		Collections.sort(v,Collections.reverseOrder());
		System.out.println(v);
		
		//Collection to array [toArray()]
		Object obj[]=v.toArray();
		
		for(Object value:obj)
		{
			System.out.print(value+", ");
		}
		
	}

}
